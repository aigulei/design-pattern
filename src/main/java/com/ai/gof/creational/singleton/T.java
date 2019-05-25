package com.ai.gof.creational.singleton;

public class T implements  Runnable {
    @Override
    public void run() {
        LazySingleton lazySingleton = LazySingleton.getInstance();
        System.out.println(lazySingleton.hashCode());
    }
}
