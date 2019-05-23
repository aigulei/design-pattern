package com.ai.thread.future;

import java.util.function.Consumer;

public class FutureService<T> {

    public Future<T> submit(FutureTask<T> task){
        AsyncFuture<T> future = new AsyncFuture<>();
        new Thread(()->{
            T result = task.call();
            future.done(result);
        }).start();
        return future;
    }

    public Future<T> submit(FutureTask<T> task, Consumer<T> consumer){
        AsyncFuture<T> future = new AsyncFuture<>();
        new Thread(()->{
            T result = task.call();
            future.done(result);
            consumer.accept(result);
        }).start();
        return future;
    }
}
