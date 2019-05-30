package com.ai.thread.workthread;

public class Client {
    public static void main(String[] args) {
        final Channel channel = new Channel(5);
        new TransportThread("Alex",channel).start();
        new TransportThread("Jack",channel).start();
        new TransportThread("Mic",channel).start();

    }
}
