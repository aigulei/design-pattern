package com.ai.thread.workthread;

import java.util.Arrays;

public class Channel {
    private final static int MAX_REQUEST = 100;

    private final Request[] reuqestQueue;

    private int head;
    private int tail;
    private int count;
    private final WorkerThread[] workerPool ;

    public Channel(int workers){
        this.reuqestQueue = new Request[MAX_REQUEST];
        this.head = 0;
        this.tail = 0;
        this.count = 0;
        this.workerPool = new WorkerThread[workers];
        this.init();
    }

    private void init() {
        for(int i =0;i<workerPool.length;i++){
            workerPool[i]= new WorkerThread("worker-"+i,this);
        }
        startWorkers();
    }

    public void startWorkers(){

        Arrays.asList(workerPool).forEach(WorkerThread::start);

    }

    public synchronized  void put(Request request){
        while (count>=workerPool.length){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.reuqestQueue[tail] = request;
        this.tail = (tail+1) % reuqestQueue.length;
        this.count++;
        this.notifyAll();
    }

    public synchronized  Request take(){
        while (count <=0){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        Request request = this.reuqestQueue[head];
        this.head = (this.head+1)%this.reuqestQueue.length;
        this.count--;
        this.notifyAll();
        return request;
    }
}
