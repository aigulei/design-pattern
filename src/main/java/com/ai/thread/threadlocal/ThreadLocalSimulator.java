package com.ai.thread.threadlocal;

import java.util.HashMap;
import java.util.Map;

public class ThreadLocalSimulator<T> {
    private final Map<Thread,T> storage = new HashMap<>();

    public void set(T t){
        synchronized (this){
            storage.put(Thread.currentThread(),t);
        }
    }

    public T get(){
        return storage.get(Thread.currentThread());
    }
}
