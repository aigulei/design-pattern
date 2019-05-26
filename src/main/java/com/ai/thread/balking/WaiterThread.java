package com.ai.thread.balking;

import java.io.IOException;

public class WaiterThread extends Thread {
    private final BalkingData data;

    public WaiterThread(BalkingData data) {
        super("Waiter");
        this.data = data;
    }

    @Override
    public void run() {
        for(int i = 0;i<200;i++){
            try {
                data.save();
                Thread.sleep(1_000L);
            } catch (IOException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
