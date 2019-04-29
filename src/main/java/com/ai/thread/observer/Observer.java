package com.ai.thread.observer;

public abstract class Observer {
    protected  Subject subject;

    public Observer(Subject subject){
        this.subject = subject;
        subject.attach(this);
    }

    public abstract void update();
}
