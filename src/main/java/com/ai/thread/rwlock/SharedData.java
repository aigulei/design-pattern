package com.ai.thread.rwlock;

public class SharedData {
    private final char[] buffer;

    private final ReadWriterLock lock = new ReadWriterLock();

    public SharedData(int size){
        this.buffer = new char[size];
        for(int i=0;i<size;i++){
            buffer[i]='*';
        }
    }

    public char[] read() throws InterruptedException {
        try {
            lock.readLock();
            return doRead();
        }finally {
            lock.readUnlock();
        }
    }

    public void write(char c) throws InterruptedException {
        try {
            lock.writeLock();
            this.doWrite(c);
        }finally {
            lock.writeUnLock();
        }
    }

    private void doWrite(char c) {
        for(int i=0;i<buffer.length;i++){
            buffer[i]=c;
            slowly(50);
        }
    }

    private char[] doRead() {
        char[] newBuf = new char[buffer.length];
        for(int i=0;i<buffer.length;i++){
            newBuf[i] = buffer[i];
        }
        slowly(50);
        return newBuf;
    }

    private void slowly(int ms){
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
