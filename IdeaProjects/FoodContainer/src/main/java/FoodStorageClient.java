
import com.ecwid.consul.v1.ConsulClient;
import com.ecwid.consul.v1.health.model.HealthService;
import org.example.foodcontainer.foodstorageservice.FoodStorageServiceGrpc;
import org.example.foodcontainer.foodstorageservice.FoodStorageServiceRequest;
import org.example.foodcontainer.foodstorageservice.FoodStorageServiceResponse;
import org.example.foodcontainer.foodstorageservice.Fruit;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import java.util.List;

    public class FoodStorageClient {
        public static void main(String[] args) {

            // Channel is used by the client to communicate with the server using the domain localhost and port 5003.
            // This is the port where our server is starting.
            ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 5003)
                    .usePlaintext()
                    .build();

            // Auto generated stub class with the constructor wrapping the channel.
            FoodStorageServiceGrpc.FoodStorageServiceBlockingStub stub =FoodStorageServiceGrpc.newBlockingStub(channel);

            // Start calling the `FruitStorageService` method
            FoodStorageServiceRequest foodStorageServiceRequest = FoodStorageServiceRequest.newBuilder()
                    .setFruit(Fruit.newBuilder()
                            .setFruitCode("NA-101")
                            .setFruitType("In Bag")
                            .build())
                    .build();

        }
    }
