package org.example;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import com.ecwid.consul.v1.ConsulClient;
import com.ecwid.consul.v1.agent.model.NewService;
import org.example.foodcontainer.foodstorageservice.FoodStorageServiceGrpc;
import org.example.foodcontainer.foodstorageservice.FoodStorageServiceRequest;
import org.example.foodcontainer.foodstorageservice.FoodStorageServiceResponse;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Properties;
import java.util.concurrent.atomic.AtomicInteger;

public class FoodStorageServer {
    private Server server;
    private static final AtomicInteger fruitBoxCount = new AtomicInteger(0); // Step 1

    private void start() throws IOException {
        /* The port on which the server should run */
        int port = 50055;
        server = ServerBuilder.forPort(port)
                .addService(new FoodStorageServiceImpl())
                .build()
                .start();
        System.out.println("Server started, listening on " + port);

        // Register server to Consul
        registerToConsul();

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.err.println("*** shutting down gRPC server since JVM is shutting down");
            org.example.FoodStorageServer.this.stop();
            System.err.println("*** server shut down");
        }));
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
        try (FileInputStream fis = new FileInputStream("src/main/resources/consul.properties")) {
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


    public static void main(String[] args) throws IOException, InterruptedException {

        final FoodStorageServer server = new FoodStorageServer();

        server.start();

        server.blockUntilShutdown();
    }

    static class FoodStorageServiceImpl extends FoodStorageServiceGrpc.FoodStorageServiceImplBase {


        @Override
        public void fruitStorage(FoodStorageServiceRequest
                                         request, StreamObserver<FoodStorageServiceResponse> responseObserver) {
            int currentBoxCount = fruitBoxCount.incrementAndGet();
            String message = "Received request: " + request.getFruit() +". Added fruit box, the current fruit box is " + currentBoxCount ;
            String message2 = " Current box is " + currentBoxCount;
            System.out.println(message);
            System.out.println(message2);

            FoodStorageServiceResponse response = FoodStorageServiceResponse.newBuilder().setResult(message).build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }

        // Server is kept alive for the client to communicate.

    }
}
