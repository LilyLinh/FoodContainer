package org.example;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import com.ecwid.consul.v1.ConsulClient;
import com.ecwid.consul.v1.agent.model.NewService;
import org.example.foodcontainer.foodstorageservice.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.time.LocalDateTime;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

import static io.grpc.ServerBuilder.*;

public class FoodStorageServer extends FoodStorageServiceGrpc.FoodStorageServiceImplBase {
    private Server server;
    private static final AtomicInteger fruitBoxCount = new AtomicInteger(0); // Step 1

    private void start() throws IOException {
        /* The port on which the server should run */
        int port = 50055;
        server = forPort(port)
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

    //static class FoodStorageServer extends FoodStorageServiceGrpc.FoodStorageServiceImplBase {
        @Override
        public void fruitStorage(FoodStorageServiceRequest
                                         request, StreamObserver<FoodStorageServiceResponse> responseObserver) {
            int currentBoxCount = fruitBoxCount.incrementAndGet();
            String message = "Received request: " + request.getFruit() + ". Added fruit box, the current fruit box is " + currentBoxCount;
            String message2 = " Current box is " + currentBoxCount;
            System.out.println(message);
            System.out.println(message2);

            FoodStorageServiceResponse response = FoodStorageServiceResponse.newBuilder()
                    .setResult(message)
                    .build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }
        @Override
        public void streamFoodEmptySpaceUpdateRequest(StreamFoodEmptySpaceUpdateRequest request, StreamObserver<StreamFoodEmptySpaceUpdateResponse> responseObserver) {
            String spaceQuery = request.getSpaceQuery();
            Runnable streamingTask = () -> {
                try {
                    while (!Thread.currentThread().isInterrupted()) {
                        String message3 = "This is a message from the server: " + spaceQuery + ". Current time: " + LocalDateTime.now();
                        StreamFoodEmptySpaceUpdateResponse response = StreamFoodEmptySpaceUpdateResponse.newBuilder()
                                .setSpaceUpdate(message3)
                                .build();
                        responseObserver.onNext(response);
                        Thread.sleep(5000); // Stream every 5 seconds
                    }
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                } finally {
                    responseObserver.onCompleted();
                }
            };

            Thread streamingThread = new Thread(streamingTask);
            streamingThread.start();
        }

        // Server is kept alive for the client to communicate.

   // }

    public static void main(String[] args) throws IOException, InterruptedException {

        FoodStorageServer server = new FoodStorageServer();
        Server grpcServer = ServerBuilder.forPort(8080)
                .addService(server)
                .build();

        grpcServer.start();
        System.out.println("Server started, listening on port 8080");
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("Shutting down gRPC server");
            try {
                grpcServer.shutdown().awaitTermination(30, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                e.printStackTrace(System.err);
            }
        }));

        grpcServer.awaitTermination();
        //server.start();
        //server.blockUntilShutdown();
    };



    }









