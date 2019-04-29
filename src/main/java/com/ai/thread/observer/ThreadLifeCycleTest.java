package com.ai.thread.observer;

import java.util.Arrays;

public class ThreadLifeCycleTest {
    public static void main(String[] args) {
        new ThreadLifeCycleListener().concurrentQuery(
                Arrays.asList("1","2","3")
        );
    }
}
