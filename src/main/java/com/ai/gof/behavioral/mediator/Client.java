package com.ai.gof.behavioral.mediator;

public class Client {
    public static void main(String[] args) {
        User u1 = new User("sky");
        User u2 = new User("jack");

        u1.sendMessage("hi,nice to meet you");
        u2.sendMessage("nice to meet you too");
    }
}
