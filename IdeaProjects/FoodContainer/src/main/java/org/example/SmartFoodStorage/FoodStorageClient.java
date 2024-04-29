package org.example.SmartFoodStorage;
import io.grpc.LoadBalancer;
import org.example.FoodStorageServer;
import org.example.foodcontainer.foodstorageservice.*;
import com.ecwid.consul.v1.ConsulClient;
import com.ecwid.consul.v1.health.model.HealthService;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;


public class FoodStorageClient {
    private final ConsulClient consulClient;
    private final String consulServiceName;


    public FoodStorageClient(String consulHost, int consulPort, String consulServiceName) {
        this.consulClient = new ConsulClient(consulHost, consulPort);
        this.consulServiceName = consulServiceName;
    }

    public void fruitStorage() {
        // Lookup service details from Consul
        List<HealthService> healthServices = consulClient.getHealthServices(consulServiceName, true, null).getValue();
        if (healthServices.isEmpty()) {
            System.err.println("No healthy instances of " + consulServiceName + " found in Consul.");
            return;
        }

        // Pick the first healthy instance (you can implement a load balancing strategy here)
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

        // Create a foodStorageServiceBlockingStub for the gRPC service (blocking foodStorageServiceBlockingStub í for unary requests
        FoodStorageServiceGrpc.FoodStorageServiceBlockingStub stub = FoodStorageServiceGrpc.newBlockingStub(channel);

        // Prepare and send the unary request
        FoodStorageServiceRequest request = FoodStorageServiceRequest.newBuilder().setFruit("Request to add one box of fruit to container").build();
        FoodStorageServiceResponse response = stub.fruitStorage(request);

        // Process the response
        System.out.println("Storage notification: " + response.getResult());

        channel.shutdown();
    }

    public void streamFoodEmptySpaceUpdateRequest() {
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
        FoodStorageServiceGrpc.FoodStorageServiceStub foodStorageServiceStub = FoodStorageServiceGrpc.newStub(channel);

        // Prepare and send the server streaming request

        StreamObserver<StreamFoodEmptySpaceUpdateResponse> responseObserver = new StreamObserver<StreamFoodEmptySpaceUpdateResponse>() {
            @Override
            public void onNext(StreamFoodEmptySpaceUpdateResponse response) {
                System.out.println("Server message: " + response.getSpaceUpdate());
            }

            @Override
            public void onError(Throwable t) {
                System.err.println("Error in server streaming: " + t.getMessage());
            }
            @Override
            public void onCompleted() {
                System.out.println("Server streaming completed");
            }
        };

        foodStorageServiceStub.streamFoodEmptySpaceUpdateRequest(StreamFoodEmptySpaceUpdateRequest.newBuilder().
                setSpaceQuery("One more fruit box").
                build(), responseObserver);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Press 'Q' to quit");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("Q")) {
                try {
                    channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
                } catch (InterruptedException e) {
                    System.err.println("Error while shutting down client: " + e.getMessage());
                }
                break;
            }
        }

    }

    public static void main(String[] args) {
        String consulHost = "localhost"; // Consul host
        int consulPort = 8500; // Consul port
        String consulServiceName = "Fruit-Storage-service"; // Name of the service registered in Consul
        FoodStorageClient client = new FoodStorageClient(consulHost, consulPort, consulServiceName);
        client.fruitStorage();
        client.streamFoodEmptySpaceUpdateRequest();
    }

}