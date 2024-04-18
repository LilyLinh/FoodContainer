package org.example;

import io.grpc.stub.StreamObserver;
import org.example.foodcontainer.foodstorageservice.FoodStorageServiceGrpc;
import org.example.foodcontainer.foodstorageservice.FoodStorageServiceRequest;
import org.example.foodcontainer.foodstorageservice.FoodStorageServiceResponse;
import org.example.foodcontainer.foodstorageservice.FoodStorageServiceResponseMultiple;

public class FoodStorageServiceImpl extends FoodStorageServiceGrpc.FoodStorageServiceImplBase {

    public void storeFruit(FoodStorageServiceRequest request, StreamObserver<FoodStorageServiceResponse> responseObserver) {

        String fruitCode = request.getFruit().getFruitCode();
        String fruitType = request.getFruit().getFruitType();

        System.out.println("The fruit of type " + fruitType + " and code " + fruitCode + " is stored the container.");
        String resultMsg = "The fruit of code " + fruitCode + " and type " + fruitType + " is stored.";

        FoodStorageServiceResponse foodStorageServiceResponse = FoodStorageServiceResponse
                .newBuilder()
                .setResult(resultMsg)
                .build();

        // Send the response to the client.
        responseObserver.onNext(foodStorageServiceResponse);

        // Notifies the customer that the call is completed.
        responseObserver.onCompleted();
        System.out.println(resultMsg);

    }

    public void storeFruitMultiple(FoodStorageServiceRequest request, StreamObserver<FoodStorageServiceResponseMultiple> responseObserver) {

        String fruitCode = request.getFruit().getFruitCode();
        String fruitType = request.getFruit().getFruitType();

        // Create response no.1 then send.
        String responseNo1 = "The fruit with code " + fruitCode + " and type " + fruitType + " is stored in the container.";
        System.out.println(responseNo1);
        FoodStorageServiceResponseMultiple foodStorageServiceResponseNo1 = FoodStorageServiceResponseMultiple
                .newBuilder()
                .setResult(responseNo1)
                .build();
        responseObserver.onNext(foodStorageServiceResponseNo1);
    }
}