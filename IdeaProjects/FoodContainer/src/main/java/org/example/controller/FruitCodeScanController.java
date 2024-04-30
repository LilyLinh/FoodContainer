package org.example.controller;


import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import org.example.foodcontainer.fruitcodescanservice.*;
import io.grpc.stub.StreamObserver;
import org.example.foodcontainer.fruitcodescanservice.FruitCodeScanResponse;
import org.example.foodcontainer.fruitcodescanservice.FruitCodeScanServiceGrpc;
import org.example.foodcontainer.fruitcodescanservice.StreamFruitCodeScanRequest;


public class FruitCodeScanController {
// Call JavaFX element
    @FXML
    public TextArea fruitTextArea;

    @FXML
    public Button submitButton6;
// Declare channel and stub to use Gprc
    private ManagedChannel channel;
    private FruitCodeScanServiceGrpc.FruitCodeScanServiceStub stub;


    // Initialize channel and stub to connect with server
    public void initialize() {
        channel = ManagedChannelBuilder.forAddress("localhost", 50056).usePlaintext().build();
        stub = FruitCodeScanServiceGrpc.newStub(channel);
    }

    // Create method with function ActionEvent in JVFX to get data with button
    // this is unary grpc method invoked by event Javafx element
    @FXML
    void submitButtonClickOnAction6(ActionEvent event) {

        boolean isContainerOpen6 = submitButton6.isHover();

        StreamFruitCodeScanRequest request = StreamFruitCodeScanRequest.newBuilder()
                .setScanRequest("Request to scan one box of fruit ")
                .build();
        stub.fruitCodeScanRequest(request, new StreamObserver<FruitCodeScanResponse>() {
            @Override
            public void onNext(FruitCodeScanResponse response) {
                System.out.println("Storage notification: " + response.getScanResponse());

                javafx.application.Platform.runLater(() -> {
                    if (isContainerOpen6) {
                        //submitButton.setBackground(Background.fill(javafx.scene.paint.Color.GREEN));

                        fruitTextArea.setText(response.getScanResponse());
                    } else {
                        //submitButton.setBackground(Background.fill(javafx.scene.paint.Color.RED));
                        submitButton6.setText("Open");
                    }
                });
            }

            @Override
            public void onError(Throwable t) {
                System.out.println("Error: " + t.getMessage());
            }

            @Override
            public void onCompleted() {
                System.out.println("Completed");
            }
        });
    }
}
