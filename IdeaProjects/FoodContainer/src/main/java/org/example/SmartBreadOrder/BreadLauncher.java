package org.example.SmartBreadOrder;
import org.example.SmartBreadOrder.BreadOrderServer;
import org.example.SmartBreadOrder.BreadFormApp;
import org.example.SmartBreadOrder.BreadOrderClient;
import java.io.IOException;


public class BreadLauncher {

    public static void main(String[] args) {
        // Create thread which starts server
        Thread serverThread = new Thread(() -> {
            try {
                final BreadOrderServer breadOrderServer = new BreadOrderServer();
                breadOrderServer.start();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    // Start server from this thread and start Java FX application from main thread
        serverThread.start();
        BreadFormApp.main(args);
    }
}

