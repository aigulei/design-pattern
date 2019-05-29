package com.ai.thread.twophasetermination;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        CountIncrement countIncrement = new CountIncrement();
        countIncrement.start();
        Thread.sleep(10_000);
        countIncrement.close();
    }
}
