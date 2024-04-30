package org.example.controller;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import org.example.foodcontainer.foodstorageservice.*;
import io.grpc.stub.StreamObserver;
import java.util.concurrent.TimeUnit;

public class SimplerFormController {
    // Call JavaFX element
    @FXML
    public TextArea fruitStorageRequestTextArea;
    public Button submitButton;
    public Button submitButton2;
    public Button submitButton3;
    // Declare channel and stub to use Gprc
    private ManagedChannel channel;
    private FoodStorageServiceGrpc.FoodStorageServiceStub stub;


    // Initialize channel and stub to connect with server
    public void initialize() {
        channel = ManagedChannelBuilder.forAddress("localhost", 50055).usePlaintext().build();
        stub = FoodStorageServiceGrpc.newStub(channel);
    }

    // Create method with function ActionEvent in JVFX to get data with button
    // this is unary grpc method
    @FXML
    void submitButtonClickOnAction(ActionEvent event) {

        boolean isContainerOpen = submitButton.isHover();

        FoodStorageServiceRequest request = FoodStorageServiceRequest.newBuilder()
                .setFruit("Request to add one box of fruit to container")
                .build();
        stub.fruitStorage(request, new StreamObserver<FoodStorageServiceResponse>() {
            @Override
            public void onNext(FoodStorageServiceResponse response) {
                System.out.println("Storage notification: " + response.getResult());

                javafx.application.Platform.runLater(() -> {
                    if (isContainerOpen) {
                        //submitButton.setBackground(Background.fill(javafx.scene.paint.Color.GREEN));
                        submitButton.setText("Close");
                        fruitStorageRequestTextArea.setText(response.getResult());
                    } else {
                        //submitButton.setBackground(Background.fill(javafx.scene.paint.Color.RED));
                        submitButton.setText("Open");
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
    // Get data from streaming server method
    @FXML
    void submitButtonClickOnAction2(ActionEvent event) {
        boolean isContainerOpen = submitButton2.isHover();
        boolean isContainerOpen2 = submitButton3.isHover();


        // Prepare and send the request
        StreamObserver<StreamFoodEmptySpaceUpdateResponse> responseObserver = new StreamObserver<StreamFoodEmptySpaceUpdateResponse>() {

            @Override
            public void onNext(StreamFoodEmptySpaceUpdateResponse response) {
                if(!channel.isShutdown()){System.out.println("Server message: " + response.getSpaceUpdate());}

                javafx.application.Platform.runLater(() -> {
                    if (isContainerOpen& !channel.isShutdown()) {
                        fruitStorageRequestTextArea.setText(response.getSpaceUpdate());
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
        };

        StreamFoodEmptySpaceUpdateRequest request = StreamFoodEmptySpaceUpdateRequest.newBuilder()
                .setSpaceQuery("Client: Add fruit box automatically")
                .build();
        stub.streamFoodEmptySpaceUpdateRequest(request, responseObserver);

        if (isContainerOpen2) {
            try {
                channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                System.err.println("Error while shutting down client: " + e.getMessage());
            }
        }
    }
}

