package org.example.SmartFruitScan;
import org.example.SmartFruitScan.FruitCodeScanServer;
import org.example.SmartFruitScan.FruitCodeScanApp;

import java.io.IOException;


public class FruitLauncher {

    public static void main(String[] args) {
        // Create thread which starts server
        Thread serverThread = new Thread(() -> {
            try {
                final FruitCodeScanServer fruitCodeScanServer = new FruitCodeScanServer();
                fruitCodeScanServer.start();

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        // Start server from this thread and start Java FX application from main thread
        serverThread.start();
        FruitCodeScanApp.main(args);
    }
}

