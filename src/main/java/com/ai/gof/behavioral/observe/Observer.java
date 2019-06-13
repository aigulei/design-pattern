package com.ai.gof.behavioral.observe;

public abstract class Observer {
    protected Subject subject;
    public Observer(Subject subject){
        this.subject = subject;
    }
    abstract void change();
}
