package org.example.SmartBreadOrder;

import org.example.foodcontainer.*;
import io.grpc.stub.StreamObserver;
import org.example.foodcontainer.breadorderservice.BreadOrderServiceGrpc;
import org.example.foodcontainer.breadorderservice.StreamBreadOrderResponse;
import org.example.foodcontainer.breadorderservice.StreamBreadOrderRequest;


public class BreadOrderServiceImpl extends BreadOrderServiceGrpc.BreadOrderServiceImplBase {
    public StreamObserver<StreamBreadOrderRequest> breadOrderRequest
            (StreamObserver<StreamBreadOrderResponse> responseObserver) {
        return new StreamObserver<StreamBreadOrderRequest>() {
            @Override
            public void onNext(StreamBreadOrderRequest breadRequest) {
                System.out.println("Received client request:");
                System.out.println("Get " + breadRequest.getOrderRequest()
                        + breadRequest.getOrderTime());
            }

            @Override
            public void onError(Throwable t) {
                System.err.println("Error in client information streaming: " + t.getMessage());
            }

            @Override
            public void onCompleted() {
                System.out.println("Client information streaming completed");
                StreamBreadOrderResponse response = StreamBreadOrderResponse.newBuilder()
                        .setOrderResponse("Client information streaming completed")
                        .build();
                responseObserver.onNext(response);
                responseObserver.onCompleted();
            }
        };
    }
}







