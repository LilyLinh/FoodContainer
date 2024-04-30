package org.example.SmartFoodStorage;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.example.controller.SimplerFormController;

import java.util.Objects;

public class SimplerFormApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent parent = FXMLLoader.load(Objects.requireNonNull(this.getClass().getResource("/SimplerForm.fxml")));
        Scene scene = new Scene(parent, 800, 600);
        primaryStage.setTitle("Smart Food Storage");
        primaryStage.centerOnScreen();
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    // Start Java FX application
    public static void main(String[] args) {
        launch(args);
    }
}
