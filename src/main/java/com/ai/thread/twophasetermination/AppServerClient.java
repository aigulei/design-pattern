package com.ai.thread.twophasetermination;

public class AppServerClient {
    public static void main(String[] args) {
        AppServer server = new AppServer(13345);
        server.start();

        try {
            Thread.sleep(25000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        server.shutdown();

    }
}
