package com.ai.thread.balking;

public class BalkingClient {
    public static void main(String[] args) {
        BalkingData balkingData = new BalkingData("E:\\HighJava\\IdeaProjects\\design-pattern\\balking.txt"
                ,"===Begin===");
        new CustomerThread(balkingData).start();
        new WaiterThread(balkingData).start();
    }

}
