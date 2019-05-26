package com.ai.thread.guardedsuspension;

public class SuspensionClient {
    public static void main(String[] args) throws InterruptedException {
        final RequestQueue queue = new RequestQueue();
        new ClientThread(queue,"Sky").start();

        ServerThread serverThread = new ServerThread(queue);
        serverThread.start();
        Thread.sleep(10000);

        serverThread.close();
    }
}
