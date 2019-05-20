package com.ai.gof.creational.simplefactory;

/**
 * 简单工厂模式
 */
public class Main {

    public static void main(String[] args) {
        VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getVideo("java");
        if(video==null)
            return;
        video.produce();

        video = videoFactory.getVideo(PythonVideo.class);
        if(video==null)
            return;
        video.produce();
    }
}
