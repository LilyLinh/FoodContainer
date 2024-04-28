package org.example;

import java.io.IOException;

public class ServerThreadManager {
    private static ServerThreadManager instance;
    private Thread serverThread;

    private ServerThreadManager() {
        // Private constructor to prevent instantiation
    }

    public static synchronized ServerThreadManager getInstance() {
        if (instance == null) {
            instance = new ServerThreadManager();
        }
        return instance;
    }

    public void startServer() {
        serverThread = new Thread(() -> {
            try {
                final FoodStorageServer foodStorageServer = new FoodStorageServer();
                foodStorageServer.start();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        serverThread.start();
    }

    public void stopServer() {
        if (serverThread != null && serverThread.isAlive()) {
            serverThread.interrupt();
        }
    }
}
