package com.ai.gof.behavioral.observe;

public class Client {
    public static void main(String[] args) {
        Subject subject = new Subject();
        new HexObserver(subject);
        new OctalObserver(subject);
        subject.setState(99);
        System.out.println("------------");
        subject.setState(99);
        System.out.println("------------");
        subject.setState(100);
    }
}
