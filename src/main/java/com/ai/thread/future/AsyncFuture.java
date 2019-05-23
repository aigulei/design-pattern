package com.ai.thread.future;


public class AsyncFuture<T> implements Future<T> {

    private volatile  boolean done = false;
    private T result;

    public void done(T result){
        synchronized (this){
            this.done = true;
            this.result = result;
            this.notifyAll();
        }
    }
    @Override
    public T get() {
        synchronized (this){
            while (!done){
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            return result;
        }
    }
}
