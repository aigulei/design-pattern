package com.ai.thread.countdown;

import java.util.stream.IntStream;

public class CustomCountDownClient {
    public static void main(String[] args) {
        CountDown down = new CountDown(5);
        System.out.println("准备多线程处理任务");
        IntStream.rangeClosed(1,5).forEach( i ->{
            new Thread(()->{
                System.out.println(Thread.currentThread().getName()+" is working...");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                down.down();
            },String.valueOf(i)).start();
        });
        down.await();
        System.out.println("多线程任务全部结束，准备第二阶段");
    }
}
