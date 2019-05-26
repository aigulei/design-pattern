package com.ai.thread.threadlocal;

import java.util.Random;

public class ThreadLocalSimulatorTest {
    private final static ThreadLocalSimulator<String> threadLocalSimulator = new ThreadLocalSimulator<>();

    private final static Random random = new Random(System.currentTimeMillis());
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() ->{
            threadLocalSimulator.set("Thread-T1");
            try {
                Thread.sleep(random.nextInt(1000));
                System.out.println(Thread.currentThread().getName()+"..."+threadLocalSimulator.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread t2 = new Thread(() ->{
            threadLocalSimulator.set("Thread-T2");
            try {
                Thread.sleep(random.nextInt(1000));
                System.out.println(Thread.currentThread().getName()+"..."+threadLocalSimulator.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("------------");
        System.out.println(Thread.currentThread().getName()+"..."+threadLocalSimulator.get());
    }
}
