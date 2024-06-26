package org.example.SmartFoodStorage;
import org.example.FoodStorageServer;

import java.io.IOException;




public class Launcher {

    public static void main(String[] args) {
        // Create thread which starts server
        Thread serverThread = new Thread(() -> {
            try {
                final FoodStorageServer foodStorageServer = new FoodStorageServer();
                foodStorageServer.start();

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        // Start server from this thread and start Java FX application from main thread
        serverThread.start();
        SimplerFormApp.main(args);
    }
}
