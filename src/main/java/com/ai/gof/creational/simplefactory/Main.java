package com.ai.gof.creational.simplefactory;

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
