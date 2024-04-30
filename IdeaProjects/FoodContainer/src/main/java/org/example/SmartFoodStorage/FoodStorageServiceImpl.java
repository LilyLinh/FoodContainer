package org.example.SmartFoodStorage;

import io.grpc.stub.StreamObserver;
import org.example.foodcontainer.foodstorageservice.*;
import org.example.foodcontainer.foodstorageservice.FoodStorageServiceRequest;

import java.time.LocalDateTime;
import java.util.concurrent.atomic.AtomicInteger;


public class FoodStorageServiceImpl extends FoodStorageServiceGrpc.FoodStorageServiceImplBase {
    // Initialize variable for request with fruitBoxCount++ update
private static final AtomicInteger fruitBoxCount = new AtomicInteger(0);
// Create Unary grpc method
    public void fruitStorage(FoodStorageServiceRequest request, StreamObserver<FoodStorageServiceResponse> responseObserver) {

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
// Create Grpc server streaming method
   public void streamFoodEmptySpaceUpdateRequest(StreamFoodEmptySpaceUpdateRequest request, StreamObserver<StreamFoodEmptySpaceUpdateResponse> responseObserver) {
       String spaceQuery = request.getSpaceQuery();

       Runnable streamingTask = () -> {
           try {
               while (!Thread.currentThread().isInterrupted()) {
                   String message3 = "Auto fruit boxes input notification: " + spaceQuery + " is stored. Time input: " + LocalDateTime.now();
                   StreamFoodEmptySpaceUpdateResponse response = StreamFoodEmptySpaceUpdateResponse.newBuilder()
                           .setSpaceUpdate(message3)
                           .build();
                   responseObserver.onNext(response);
                   Thread.sleep(3000); // Stream every 5 seconds
               }
           } catch (InterruptedException e) {
               Thread.currentThread().interrupt();
           } finally {
               responseObserver.onCompleted();
           }
       };
       // create thread start streaming method
       Thread streamingThread = new Thread(streamingTask);
       streamingThread.start();

   }
}


