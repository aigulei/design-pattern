package com.ai.gof.creational.factorymethod;

/**
 * 工厂方法模式
 */
public class Main {

    public static void main(String[] args) {
        VideoFactory factory = new JavaVideoFactory();
        Video video = factory.getVideo();
        video.produce();

        factory = new FEVideoFactory();
        video = factory.getVideo();
        video.produce();
    }
}
