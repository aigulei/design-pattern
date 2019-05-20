package com.ai.thread.rwlock;

public class ReadWriterLock {

    private int readingReaders = 0;
    private int waitingReaders = 0;
    private int writingWriters = 0;
    private int waitingWriters = 0;
    private boolean preferWriter = true;

    public ReadWriterLock(){
        this(true);
    }

    public ReadWriterLock(boolean preferWriter){
        this.preferWriter = preferWriter;
    }


    public synchronized void readLock() throws InterruptedException {
        this.waitingReaders++;
        try {
            while (writingWriters>0||(preferWriter && waitingWriters>0)){
                this.wait();
            }
            this.readingReaders++;
        }finally {
            this.waitingReaders--;
        }
    }

    public synchronized void readUnlock(){
        this.readingReaders--;
        this.notifyAll();
    }

    public synchronized  void writeLock() throws InterruptedException {
        this.waitingWriters++;
        try {
            while (this.readingReaders>0||this.writingWriters>0){
                this.wait();
            }
            this.writingWriters++;
        }finally {
            this.waitingWriters--;
        }
    }

    public synchronized  void writeUnLock(){
        this.writingWriters--;
        this.notifyAll();
    }

}
