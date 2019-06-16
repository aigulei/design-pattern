package com.ai.gof.behavioral.chainofresponsibility;


public class VideoApprover extends Approver {
    @Override
    public void deploy(Course course) {
        if(course!=null && course.getVideo()!=null){
            System.out.println(course.getName()+"含有视频，批准");
            if(approver !=null){
                approver.deploy(course);
            }
        }else {
            System.out.println(course.getName()+"不包含视频，不批准");
            return;
        }
    }
}
