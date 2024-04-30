package org.example.controller;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import org.example.foodcontainer.breadorderservice.*;
import org.example.foodcontainer.breadorderservice.StreamBreadOrderRequest;
import org.example.foodcontainer.breadorderservice.StreamBreadOrderResponse;
import org.example.foodcontainer.breadorderservice.BreadOrderServiceGrpc;
import org.example.foodcontainer.breadorderservice.BreadOrderServiceGrpc.BreadOrderServiceStub;
import java.time.LocalDateTime;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class BreadFormController {
    // Call JavaFX element
    @FXML
    public TextArea breadOrderTextArea;
    @FXML
    public Button submitButton4;
    public Button submitButton5;
    public Button submitButton6;
    // Declare channel and stub to use Gprc
    private ManagedChannel channel;
    private BreadOrderServiceGrpc.BreadOrderServiceStub stub;
   // private CountDownLatch latch;


    public void initialize() {
        channel = ManagedChannelBuilder.forAddress("localhost", 50052).usePlaintext().build();
        stub = BreadOrderServiceGrpc.newStub(channel);
    }

    @FXML
    void submitButtonClickOnAction4(ActionEvent event) {
        boolean isContainerOpen = submitButton4.isHover();

        StreamObserver<StreamBreadOrderRequest> requestObserver = stub.breadOrderRequest
                (new StreamObserver<StreamBreadOrderResponse>() {

                    @Override
                    public void onNext(StreamBreadOrderResponse response) {

                        System.out.println("Server response: " + response.getOrderResponse());

                        javafx.application.Platform.runLater(() -> {
                            if (isContainerOpen) {
                                breadOrderTextArea.setText("Server response: " + response.getOrderResponse());
                            }
                        });
                    }

                    @Override
                    public void onError(Throwable t) {
                       // latch.countDown();
                        System.err.println("Error in server streaming: " + t.getMessage());
                    }

                    @Override
                    public void onCompleted() {
                        System.out.println("Server streaming completed");
                    }
                });
        try {
            while (true) {
                String orderTime = LocalDateTime.now().toString();
                StreamBreadOrderRequest breadRequest = StreamBreadOrderRequest.newBuilder()

                        .setOrderRequest("Order one bread box")
                        .setOrderTime(orderTime)
                        .build();

                requestObserver.onNext(breadRequest);

                Thread.sleep(3000); // Send information every 3 seconds
            }
            } catch(InterruptedException e){
                e.printStackTrace();
            }
                requestObserver.onCompleted();
    }

    @FXML
        public void shutdown() {

        boolean isContainerOpen5 = submitButton5.isHover();
        if (isContainerOpen5) {
            try {
                channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
                breadOrderTextArea.setText("Error while shutting down");
            } catch (InterruptedException e) {
                System.err.println("Error while shutting down client: " + e.getMessage());

            }
        }
    }
}











