package org.example;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import org.example.foodcontainer.foodstorageservice.*;
import org.example.foodcontainer.foodstorageservice.FoodStorageServiceRequest;

import java.util.concurrent.TimeUnit;


public class FoodStorageServiceImpl extends FoodStorageServiceGrpc.FoodStorageServiceImplBase {

    public void fruitStorage(FoodStorageServiceRequest request, StreamObserver<FoodStorageServiceResponse> responseObserver) {

        String fruitCode = request.getFruitCode();
        String fruitType = request.getFruitType();

        System.out.println("The fruit of type " + fruitType + " and code " + fruitCode + " is stored the container.");
        String resultMsg = "The fruit of code " + fruitCode + " and type " + fruitType + " is stored.";

        FoodStorageServiceResponse response = FoodStorageServiceResponse
                .newBuilder()
                .setResult(resultMsg)
                .build();

        // Send the response to the client.
        responseObserver.onNext(response);

        // Notifies the customer that the call is completed.
        responseObserver.onCompleted();
        System.out.println(resultMsg);

    }

  //  public void streamFoodEmptySpaceUpdateRequest(StreamFoodEmptySpaceUpdateRequest request, StreamObserver<StreamFoodEmptySpaceUpdateResponse> responseObserver) {
       // Server grpcServer = ServerBuilder.forPort(8500)
             //   .addService(new FoodStorageServer.FoodStorageServiceImpl())
              //  .build();



        // Graceful shutdown



    }
        // Send the response to the client.

        //  Make thread wait for 6s then send response N0.2

        // Create response no.2 then send.

