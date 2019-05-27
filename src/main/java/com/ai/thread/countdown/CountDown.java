package com.ai.thread.countdown;

public class CountDown {
    private final int total;

    private int couter = 0;

    public CountDown(int total){
        this.total = total;
    }

    public void down(){
        synchronized (this){
            this.couter++;
            this.notifyAll();
        }
    }

    public void await(){
        synchronized (this){
            while (couter<total){
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
