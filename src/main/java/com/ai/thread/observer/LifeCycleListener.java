package com.ai.thread.observer;

public interface LifeCycleListener {

    void onEvent(ObservableRunnable.RunnableEvent event);
}
