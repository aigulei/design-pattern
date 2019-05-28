package com.ai.thread.threadpermessage;

import java.util.stream.IntStream;

public class PerThreadClient {
    public static void main(String[] args) {
        MessageHandler messageHandler = new MessageHandler();
        IntStream.rangeClosed(0,10).forEach(i ->{
            messageHandler.request(new Message(String.valueOf(i)));
        });
        messageHandler.shutdown();
    }
}
