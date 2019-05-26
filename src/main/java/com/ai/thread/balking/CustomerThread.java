package com.ai.thread.balking;

import java.io.IOException;
import java.util.Random;

public class CustomerThread extends Thread{
    private final  BalkingData data;

    private final Random random = new Random(System.currentTimeMillis());

    public CustomerThread(BalkingData data) {
        super("Customer");
        this.data = data;
    }

    @Override
    public void run() {
        try {
            data.save();
            for(int i=0;i<20;i++){
                data.change("No."+i);
                Thread.sleep(random.nextInt(1000));
                data.save();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
