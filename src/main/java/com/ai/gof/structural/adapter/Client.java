package com.ai.gof.structural.adapter;

public class Client {
    public static void main(String[] args) {
        DC5V dc5V = new PowerAdapter();
        dc5V.outputDC5V();
    }
}
