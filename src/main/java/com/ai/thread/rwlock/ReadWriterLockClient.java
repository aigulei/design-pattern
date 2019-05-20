package com.ai.thread.rwlock;

/**
 * ReadWriteLock design pattern
 * Reader-Writer design pattern
 */
public class ReadWriterLockClient {
    public static void main(String[] args) {
        final SharedData sharedData = new SharedData(10);
        new ReaderWorker(sharedData).start();
        new ReaderWorker(sharedData).start();
        new ReaderWorker(sharedData).start();
        new ReaderWorker(sharedData).start();
        new ReaderWorker(sharedData).start();

        new WriterWorker(sharedData,"qwerayteakisdfal").start();
        new WriterWorker(sharedData,"AWEISI131JSD").start();

    }
}
