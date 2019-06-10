package com.ai.thread.activeobject;

import java.util.LinkedList;

public class ActivationQueue {
    private final static int MAX_METHOD_REQUEST_QUEUE_SIZE = 100;

    private final LinkedList<MethodRequest> methodQueue;

    public ActivationQueue(){
        methodQueue = new LinkedList<>();
    }

    public synchronized void put(MethodRequest methodRequest){
        while (methodQueue.size()>=MAX_METHOD_REQUEST_QUEUE_SIZE){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.methodQueue.addLast(methodRequest);
        this.notifyAll();
    }
    public synchronized MethodRequest take(){
        while (methodQueue.isEmpty()){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        MethodRequest request = this.methodQueue.removeFirst();
        this.notifyAll();
        return request;
    }
}
