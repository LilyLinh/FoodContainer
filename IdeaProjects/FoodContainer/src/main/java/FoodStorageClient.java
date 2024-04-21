
import org.example.FoodStorageServer;
import org.example.foodcontainer.foodstorageservice.*;
import com.ecwid.consul.v1.ConsulClient;
import com.ecwid.consul.v1.health.model.HealthService;
import org.example.foodcontainer.foodstorageservice.FoodStorageServiceGrpc;
import org.example.foodcontainer.foodstorageservice.FoodStorageServiceRequest;
import org.example.foodcontainer.foodstorageservice.FoodStorageServiceResponse;
import org.example.foodcontainer.foodstorageservice.Fruit;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import java.io.IOException;
import java.util.List;
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


        ManagedChannel channel = ManagedChannelBuilder.forAddress(serverHost, serverPort).usePlaintext().build();

        // Create a stub for the gRPC service
        FoodStorageServiceGrpc.FoodStorageServiceBlockingStub stub = FoodStorageServiceGrpc.newBlockingStub(channel);

        // Prepare and send the unary request
        FoodStorageServiceRequest fruit = FoodStorageServiceRequest.newBuilder().setFruit("Request to add one box of fruit to container").build();
        FoodStorageServiceResponse response = stub.fruitStorage(fruit);

        // Process the response
        System.out.println("Storage notification: " + response.getResult());

        // Shutdown the channel when done
        channel.shutdown();
    }

    public static void main(String[] args) {
        String consulHost = "localhost"; // Consul host
        int consulPort = 8500; // Consul port
        String consulServiceName = "Fruit-Storage-service"; // Name of the service registered in Consul

        FoodStorageClient client = new FoodStorageClient(consulHost, consulPort, consulServiceName);
        client.fruitStorage();
    }
}
