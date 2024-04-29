package org.example.SmartFruitScan;

import org.example.foodcontainer.fruitcodescanservice.FruitCodeScanServiceGrpc;
import org.example.foodcontainer.fruitcodescanservice.StreamFruitCodeScanRequest;
import org.example.foodcontainer.fruitcodescanservice.FruitCodeScanResponse;
import org.example.foodcontainer.fruitcodescanservice.*;
import com.ecwid.consul.v1.ConsulClient;
import com.ecwid.consul.v1.health.model.HealthService;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;


public class FruitCodeScanClient {
    private final ConsulClient consulClient;
    private final String consulServiceName;
    private ManagedChannel channel;


    public FruitCodeScanClient(String consulHost, int consulPort, String consulServiceName) {
        this.consulClient = new ConsulClient(consulHost, consulPort);
        this.consulServiceName = consulServiceName;
    }

    public void fruitCodeScanRequest() {
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
        FruitCodeScanServiceGrpc.FruitCodeScanServiceBlockingStub stub = FruitCodeScanServiceGrpc.newBlockingStub(channel);

        // Prepare and send the client streaming request

//        StreamObserver<StreamFruitCodeScanRequest> requestObserver = stub.fruitCodeScanRequest
//                (new StreamObserver<FruitCodeScanResponse>() {
//                    @Override
//                    public void onNext(FruitCodeScanResponse response) {
//                        System.out.println("Server rersponse: " + response.getScanResponse());
//                    }
//
//                    @Override
//                    public void onError(Throwable t) {
//                        System.err.println("Error in server streaming: " + t.getMessage());
//                    }
//
//                    @Override
//                    public void onCompleted() {
//                        System.out.println("Server streaming completed");
//                    }
//                });
//        try {
//            while (true) {
//                String scanTime = LocalDateTime.now().toString();
//                StreamFruitCodeScanRequest scannRequest = StreamFruitCodeScanRequest.newBuilder()
//                        .setScanRequest("Receive one scan request at " + scanTime)
//                        .build();
//                requestObserver.onNext(scannRequest);
//                Thread.sleep(5000); // Send information every 5 seconds
//            }
//        } catch (InterruptedException e) {
//            Thread.currentThread().interrupt();
//        }
//        requestObserver.onCompleted();
//    }
//    // Define method to shutdown client
//    public void shutdown () throws InterruptedException {
//        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
//    }

        // Prepare and send the unary request
        StreamFruitCodeScanRequest request = StreamFruitCodeScanRequest.newBuilder().setScanRequest("Request to scan one fruit item").build();
        FruitCodeScanResponse response = stub.fruitCodeScanRequest(request);

        // Process the response
        System.out.println("Server notification: " + response.getScanResponse());

        channel.shutdown();
    }

    public static void main(String[] args) throws InterruptedException {
        String consulHost = "localhost"; // Consul host
        int consulPort = 8500; // Consul port
        String consulServiceName = "Fruit-CodeScan-service"; // Name of the service registered in Consul
        org.example.SmartFruitScan.FruitCodeScanClient client = new org.example.SmartFruitScan.FruitCodeScanClient(consulHost, consulPort, consulServiceName);
        client.fruitCodeScanRequest();

    }
}



