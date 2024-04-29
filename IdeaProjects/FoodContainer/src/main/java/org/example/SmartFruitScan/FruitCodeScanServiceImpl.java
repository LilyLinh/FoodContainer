package org.example.SmartFruitScan;

import io.grpc.stub.StreamObserver;
import org.example.foodcontainer.fruitcodescanservice.FruitCodeScanResponse;
import org.example.foodcontainer.fruitcodescanservice.StreamFruitCodeScanRequest;

public class FruitCodeScanServiceImpl {
    public StreamObserver<StreamFruitCodeScanRequest> fruitCodeScanRequest(StreamObserver<FruitCodeScanResponse> responseObserver) {
        return new StreamObserver<StreamFruitCodeScanRequest>() {
            @Override
            public void onNext(StreamFruitCodeScanRequest scannRequest) {
                System.out.println("Received client request:" + scannRequest.getScanRequest());

            }

            @Override
            public void onError(Throwable t) {
                System.err.println("Error in client information streaming: " + t.getMessage());
            }

            @Override
            public void onCompleted() {
                System.out.println("Client information streaming completed");
                FruitCodeScanResponse response = FruitCodeScanResponse.newBuilder()
                        .setScanResponse("Client information streaming completed")
                        .build();
                responseObserver.onNext(response);
                responseObserver.onCompleted();
            }
        };
    }

}
