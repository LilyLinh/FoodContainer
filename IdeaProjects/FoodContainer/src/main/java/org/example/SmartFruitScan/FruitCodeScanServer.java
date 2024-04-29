package org.example.SmartFruitScan;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import com.ecwid.consul.v1.ConsulClient;
import com.ecwid.consul.v1.agent.model.NewService;
import org.example.SmartFruitScan.FruitCodeScanServiceImpl;
import org.example.foodcontainer.foodstorageservice.FoodStorageServiceRequest;
import org.example.foodcontainer.foodstorageservice.FoodStorageServiceResponse;
import org.example.foodcontainer.fruitcodescanservice.*;
import org.example.foodcontainer.fruitcodescanservice.FruitCodeScanResponse;
import org.example.foodcontainer.fruitcodescanservice.FruitCodeScanServiceGrpc;
import org.example.foodcontainer.fruitcodescanservice.StreamFruitCodeScanRequest;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class FruitCodeScanServer extends FruitCodeScanServiceGrpc.FruitCodeScanServiceImplBase {
    private static final AtomicInteger fruitItemCount = new AtomicInteger(0);
    private Server server;

    public void start() throws IOException {
        /* The port on which the server should run */
        int port = 50056;
        server = ServerBuilder.forPort(port)
                .addService(new FruitCodeScanServer())
                .build()
                .start();
        System.out.println("Server started, listening on " + port);

        // Register server to Consul
        registerToConsul();

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            try {
                server.shutdown().awaitTermination(30, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                e.printStackTrace(System.err);
            }
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
        try (FileInputStream fis = new FileInputStream("src/main/resources/fruitcodescan.properties")) {
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

    // create client stream service

//    @Override
//    public StreamObserver<StreamFruitCodeScanRequest> fruitCodeScanRequest(StreamObserver<FruitCodeScanResponse> responseObserver) {
//        return new StreamObserver<StreamFruitCodeScanRequest>() {
//            @Override
//            public void onNext(StreamFruitCodeScanRequest scannRequest) {
//                System.out.println("Received client request:" + scannRequest.getScanRequest());
//
//            }
//
//            @Override
//            public void onError(Throwable t) {
//                System.err.println("Error in client information streaming: " + t.getMessage());
//            }
//
//            @Override
//            public void onCompleted() {
//                System.out.println("Client information streaming completed");
//                FruitCodeScanResponse response = FruitCodeScanResponse.newBuilder()
//                        .setScanResponse("Client information streaming completed")
//                        .build();
//                responseObserver.onNext(response);
//                responseObserver.onCompleted();
//            }
//        };
//    }
public void fruitCodeScanRequest(StreamFruitCodeScanRequest request, StreamObserver<FruitCodeScanResponse> responseObserver) {

   int currentItemCount = fruitItemCount.incrementAndGet();
    String message = "Received request: " + request.getScanRequest() + ". Added scanned item, the current item amount is " + currentItemCount;
    System.out.println(message);

    FruitCodeScanResponse response = FruitCodeScanResponse.newBuilder()
            .setScanResponse(message)
            .build();
    responseObserver.onNext(response);
    responseObserver.onCompleted();
}

    public static void main(String[] args) throws IOException, InterruptedException {
       FruitCodeScanServer server = new FruitCodeScanServer();
        server.start();
        server.blockUntilShutdown();
    }
}









