package com.ai.gof.behavioral.observe;

public class OctalObserver extends Observer {

    public OctalObserver(Subject subject) {
        super(subject);
        this.subject.attach(this);
    }

    @Override
    public void change() {
        System.out.println("八进制:"+Integer.toOctalString(subject.getState()));
    }
}
