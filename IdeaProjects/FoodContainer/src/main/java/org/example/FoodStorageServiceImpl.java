package org.example;

import io.grpc.stub.StreamObserver;
import org.example.foodcontainer.foodstorageservice.FoodStorageServiceGrpc;
import org.example.foodcontainer.foodstorageservice.FoodStorageServiceRequest;
import org.example.foodcontainer.foodstorageservice.FoodStorageServiceResponse;
import org.example.foodcontainer.foodstorageservice.FoodStorageServiceResponseMultiple;

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


        //  Make thread wait for 6s then send response N0.2

        // Create response no.2 then send.

}