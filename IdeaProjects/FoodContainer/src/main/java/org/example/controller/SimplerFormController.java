package org.example.controller;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import org.example.foodcontainer.foodstorageservice.*;
import io.grpc.stub.StreamObserver;

import java.util.concurrent.TimeUnit;

public class SimplerFormController {
    @FXML
    public TextField nameTextField;
    @FXML
    public TextArea fruitStorageRequestTextArea;

    @FXML
    public Button submitButton;
    public Button submitButton2;
    public Button submitButton3;
    private ManagedChannel channel;
    private FoodStorageServiceGrpc.FoodStorageServiceStub stub;


//    public void setFoodStorageServer(FoodStorageServer foodStorageServer) {
//        this.foodStorageServer = foodStorageServer;
//    }

    public void initialize() {
        channel = ManagedChannelBuilder.forAddress("localhost", 50055).usePlaintext().build();
        stub = FoodStorageServiceGrpc.newStub(channel);

    }
    // Constructor to initialize the reference to FoodStorageServer
    //public SimplerFormController(FoodStorageServer foodStorageServer) {

    //this.foodStorageServer = foodStorageServer;
    //}

    @FXML
    void submitButtonClickOnAction(ActionEvent event) {
//        String request = foodStorageServer.fruitStorage(result);
//        System.out.println(foodStorageServer.fruitStorage(result));
//        String fruit = nameTextField.getText();
//        System.out.println("nameTextField: " + fruit);
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

    @FXML
    void submitButtonClickOnAction2(ActionEvent event) {
        boolean isContainerOpen = submitButton2.isHover();
        boolean isContainerOpen2 = submitButton3.isHover();


        // Prepare and send the unary request
        StreamObserver<StreamFoodEmptySpaceUpdateResponse> responseObserver = new StreamObserver<StreamFoodEmptySpaceUpdateResponse>() {
            //            StreamFoodEmptySpaceUpdateResponse response = StreamFoodEmptySpaceUpdateResponse.newBuilder()
//            {
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


//    public void shutdownChannel(ActionEvent event) {
//        if (channel != null && !channel.isShutdown()) {
//            // Shutdown the gRPC channel
//            channel.shutdown();
//            try {
//                // Wait for the channel to terminate (optional)
//                channel.awaitTermination(5, TimeUnit.SECONDS);
//                System.out.println("Channel has been shut down.");
//            } catch (InterruptedException e) {
//                System.err.println("Error while shutting down channel: " + e.getMessage());
//            }
//        }
//    }

//    public void shutdown(){
//
//        onDestroy();
//    }
    // Close channel of gRPC when stopping controller
//    public void onDestroy() {
//        if (channel != null && !channel.isShutdown()) {
//            channel.shutdown();
//        }
//    }
