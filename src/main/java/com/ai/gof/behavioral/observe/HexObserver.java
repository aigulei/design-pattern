package com.ai.gof.behavioral.observe;

public class HexObserver extends Observer {

    public HexObserver(Subject subject) {
        super(subject);
        this.subject.attach(this);
    }

    @Override
    public void change() {
        System.out.println("十六进制"+Integer.toHexString(subject.getState()));
    }
}
