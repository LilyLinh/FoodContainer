package org.example.controller;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import org.example.foodcontainer.breadorderservice.*;
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

public class BreadFormController {
    @FXML
    public TextArea breadOrderTextArea;

    @FXML
    public Button submitButton4;
    public Button submitButton5;

    private ManagedChannel channel;
    private BreadOrderServiceGrpc.BreadOrderServiceStub stub;


    public void initialize() {
        channel = ManagedChannelBuilder.forAddress("localhost", 50052).usePlaintext().build();
        stub = BreadOrderServiceGrpc.newStub(channel);
    }

    @FXML
    void submitButtonClickOnAction4(ActionEvent event) {
        boolean isContainerOpen = submitButton4.isHover();
        boolean isContainerOpen5 = submitButton5.isHover();

        StreamObserver<StreamBreadOrderRequest> requestObserver = stub.breadOrderRequest
                (new StreamObserver<StreamBreadOrderResponse>() {
                    @Override
                    public void onNext(StreamBreadOrderResponse response) {
                        if (!channel.isShutdown()) {
                            System.out.println("Server response: " + response.getOrderResponse());
                        }

                        javafx.application.Platform.runLater(() -> {
                            if (isContainerOpen) {
                                breadOrderTextArea.setText(response.getOrderResponse());
                            } else {
                                submitButton4.setText("Open");
                            }
                        });
                    }

                    @Override
                    public void onError(Throwable t) {
                        System.err.println("Error in server streaming: " + t.getMessage());
                    }

                    @Override
                    public void onCompleted() {
                        System.out.println("Server streaming completed");
                    }
                });

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








