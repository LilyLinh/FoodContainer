package org.example;
import org.example.FoodStorageServer;
import java.io.IOException;




public class Launcher {

    public static void main(String[] args) {
        Thread serverThread = new Thread(() -> {
            try {
                final FoodStorageServer foodStorageServer = new FoodStorageServer();
                foodStorageServer.start();

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        serverThread.start();
        SimplerFormApp.main(args);
    }
}

//}
//        FoodStorageServer foodStorageServer = null;
//        Thread serverThread = null;
//
//        try {
//            foodStorageServer = new FoodStorageServer();
//            final FoodStorageServer finalFoodStorageServer = foodStorageServer; // Create a final variable
//            serverThread = new Thread(() -> {
//                try {
//                    finalFoodStorageServer.start(); // Use the final variable inside lambda
//                } catch (IOException e) {
//                    throw new RuntimeException(e);
//                }
//            });
//            serverThread.start();
//
//            // Register a shutdown hook to gracefully shutdown the server
//            final Thread finalServerThread = serverThread; // Create a final variable for serverThread
//            Runtime.getRuntime().addShutdownHook(new Thread(() -> {
//                if (finalFoodStorageServer != null) {
//                    finalFoodStorageServer.shutdown();
//                }
//                if (finalServerThread != null) {
//                    try {
//                        finalServerThread.join();
//                    } catch (InterruptedException e) {
//                        e.printStackTrace(); // Handle or log the exception
//                    }
//                }
//            }));
//
//            SimplerFormApp.main(args); // Assuming this launches your application
//        } finally {
//            // If the server has not been shut down yet, shut it down now
//            if (foodStorageServer != null) {
//                foodStorageServer.shutdown();
//            }
//        }
//    }
//}