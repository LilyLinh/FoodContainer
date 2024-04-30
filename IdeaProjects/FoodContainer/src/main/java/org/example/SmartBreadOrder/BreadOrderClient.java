package org.example.SmartBreadOrder;
import org.example.foodcontainer.breadorderservice.*;
import com.ecwid.consul.v1.ConsulClient;
import com.ecwid.consul.v1.health.model.HealthService;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;


public class BreadOrderClient {
    private final ConsulClient consulClient;
    private final String consulServiceName;
    private ManagedChannel channel;


    public BreadOrderClient(String consulHost, int consulPort, String consulServiceName) {
        this.consulClient = new ConsulClient(consulHost, consulPort);
        this.consulServiceName = consulServiceName;
    }

    public void breadOrderRequest() {
        List<HealthService> healthServices = consulClient.getHealthServices(consulServiceName, true, null).getValue();
        if (healthServices.isEmpty()) {
            System.err.println("No healthy instances of " + consulServiceName + " found in Consul.");
            return;
        }
        HealthService healthService = healthServices.get(0);

        // Debug output for service details
        System.out.println("Service details from Consul:");
        System.out.println("Service ID: " + healthService.getService().getId());
        System.out.println("Service Name: " + healthService.getService().getService());
        System.out.println("Service Address: " + healthService.getService().getAddress());
        System.out.println("Service Port: " + healthService.getService().getPort());

        // Extract host and port from the service details
        String serverHost = healthService.getService().getAddress();
        int serverPort = healthService.getService().getPort();

        // Debug output for extracted host and port
        System.out.println("Server host: " + serverHost);
        System.out.println("Server port: " + serverPort);

        // Create a gRPC channel to connect to the server
        ManagedChannel channel = ManagedChannelBuilder.forAddress(serverHost, serverPort).usePlaintext().build();

        // This is for Streaming requests
        BreadOrderServiceGrpc.BreadOrderServiceStub stub = BreadOrderServiceGrpc.newStub(channel);

        // Prepare and send the client streaming request
        StreamObserver<StreamBreadOrderRequest> requestObserver = stub.breadOrderRequest
                (new StreamObserver<StreamBreadOrderResponse>() {
                    @Override
                    public void onNext(StreamBreadOrderResponse response) {
                        System.out.println("Server rersponse: " + response.getOrderResponse());
                    }

                    @Override
                    public void onError(Throwable t) {
                        System.err.println("Error in server streaming: " + t.getMessage());
                    }

                    @Override
                    public void onCompleted() {
                        System.out.println("Server streaming completed");
                    }
                });

            try {
            while (true) {
                Random random = new Random();
                int randomNumber = random.nextInt();
                int randomNumberInRange = random.nextInt(100);
                String orderTime = LocalDateTime.now().toString();
                StreamBreadOrderRequest breadRequest = StreamBreadOrderRequest.newBuilder()
                        .setOrderRequest("Order one bread box.Bread code number:" + randomNumberInRange + " .Pick up time: ")
                        .setOrderTime(orderTime)
                        .build();
                requestObserver.onNext(breadRequest);
                Thread.sleep(5000); // Send information every 5 seconds
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        requestObserver.onCompleted();
    }
    // Define method to shutdown client
        public void shutdown () throws InterruptedException {
            channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
        }

    public static void main(String[] args) throws InterruptedException {
        String consulHost = "localhost"; // Consul host
        int consulPort = 8500; // Consul port
        String consulServiceName = "Bread-Order-service"; // Name of the service registered in Consul
        BreadOrderClient client = new BreadOrderClient(consulHost, consulPort, consulServiceName);

         Thread streamThread = new Thread(() -> client.breadOrderRequest());// start stream client method by own thread

        streamThread.start();
        // Action to shutdown stop thread
        System.out.println("Press 'Q' to stop streaming client information");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("Q")) {
                streamThread.interrupt();
                break;
            }
        }
         //Shutdown client
       client.shutdown();
    }
}


