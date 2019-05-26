package com.ai.thread.threadlocal;

public class ThreadLocalSimpleDemo {
    private static ThreadLocal<String> threadLocal = new ThreadLocal(){
        @Override
        protected Object initialValue() {
            return "Hello,World";
        }
    };

    public static void main(String[] args) throws InterruptedException {
        //threadLocal.set("Alex");
        Thread.sleep(1000);
        System.out.println(threadLocal.get());

    }
}
