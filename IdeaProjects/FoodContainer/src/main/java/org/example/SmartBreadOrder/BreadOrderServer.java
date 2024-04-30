package org.example.SmartBreadOrder;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import com.ecwid.consul.v1.ConsulClient;
import com.ecwid.consul.v1.agent.model.NewService;
import org.example.SmartBreadOrder.BreadOrderServiceImpl;
import org.example.SmartBreadOrder.*;
import org.example.foodcontainer.breadorderservice.BreadOrderServiceGrpc;
import org.example.foodcontainer.breadorderservice.StreamBreadOrderRequest;
import org.example.foodcontainer.breadorderservice.StreamBreadOrderResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Properties;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.Random;


public class BreadOrderServer extends BreadOrderServiceGrpc.BreadOrderServiceImplBase {
    private Server server;

    public void start() throws IOException {
        /* The port on which the server should run */
        int port = 50052;
        server = ServerBuilder.forPort(port)
                .addService(new BreadOrderServiceImpl())
                .build()
                .start();
        System.out.println("Server started, listening on " + port);

        // Register server to Consul
        registerToConsul();

        Runtime.getRuntime().addShutdownHook(new Thread() {
            public void run() {
                System.err.println("*** shutting down gRPC server since JVM is shutting down");
                BreadOrderServer.this.stop();
                System.err.println("*** server shut down");

            }});

    }

    private void stop() {
        if (server != null) {
            server.shutdown();
        }
    }

    private void blockUntilShutdown() throws InterruptedException {
        if (server != null) {
            server.awaitTermination();
        }
    }

    private void registerToConsul() {
        System.out.println("Registering server to Consul...");

        // Load Consul configuration from consul.properties file
        Properties props = new Properties();
        try (FileInputStream fis = new FileInputStream("src/main/resources/breadorder.properties")) {
            props.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }
        String consulHost = props.getProperty("consul.host");
        int consulPort = Integer.parseInt(props.getProperty("consul.port"));
        String serviceName = props.getProperty("consul.service.name");
        int servicePort = Integer.parseInt(props.getProperty("consul.service.port"));
        String healthCheckInterval = props.getProperty("consul.service.healthCheckInterval");

        // Get host address
        String hostAddress;
        try {
            hostAddress = InetAddress.getLocalHost().getHostAddress();
        } catch (UnknownHostException e) {
            e.printStackTrace();
            return;
        }

        // Create a Consul client
        ConsulClient consulClient = new ConsulClient(consulHost, consulPort);

        // Define service details
        NewService newService = new NewService();
        newService.setName(serviceName);
        newService.setPort(servicePort);
        newService.setAddress(hostAddress); // Set host address

        // Register service with Consul
        consulClient.agentServiceRegister(newService);

        // Print registration success message
        System.out.println("Server registered to Consul successfully. Host: " + hostAddress);
    }
    // create method for Grpc client streaming
    @Override
    public StreamObserver<StreamBreadOrderRequest> breadOrderRequest
            (StreamObserver<StreamBreadOrderResponse> responseObserver) {
        return new StreamObserver<StreamBreadOrderRequest>() {
            @Override
            public void onNext(StreamBreadOrderRequest breadRequest) {

                System.out.println("Received client request:");
                System.out.println("Get "
                        + breadRequest.getOrderTime());}

            @Override
            public void onError(Throwable t) {
                System.err.println("Error in client information streaming: " + t.getMessage());
            }

            @Override
            public void onCompleted() {
                System.out.println("Client information streaming completed");
                StreamBreadOrderResponse response = StreamBreadOrderResponse.newBuilder()
                        .setOrderResponse("Client information streaming completed")
                        .build();
                responseObserver.onNext(response);
                responseObserver.onCompleted();
            }
        };
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        //final BreadOrderServer server = new BreadOrderServer();
        final BreadOrderServer server = new BreadOrderServer();
        server.start();
        server.blockUntilShutdown();
    }
    }






