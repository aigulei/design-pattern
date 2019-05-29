package com.ai.thread.twophasetermination;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AppServer extends  Thread {
    private int port;

    private static final int DEFAULT_PORT = 6666;

    private volatile boolean start = true;

    private List<ClientHandler> clientHandlers = new ArrayList<>();

    private final ExecutorService executor = Executors.newFixedThreadPool(10);

    public AppServer(){
        this(DEFAULT_PORT);
    }

    public AppServer(int port){
        this.port = port;
    }
    ServerSocket server;
    @Override
    public void run() {
        try {
            server = new ServerSocket(port);
            while (start){
                Socket client = server.accept();
                ClientHandler clientHandler = new ClientHandler(client);
                executor.submit(clientHandler);
                this.clientHandlers.add(clientHandler);
                System.out.println("sdfaf");
            }   
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            System.out.println("1111111111111111111111");
            this.dispose();
        }
    }

    private void dispose() {
        clientHandlers.stream().forEach(c -> c.stop());
        executor.shutdown();
    }

    public void shutdown(){
        this.start = false;
        this.interrupt();
    }
}
