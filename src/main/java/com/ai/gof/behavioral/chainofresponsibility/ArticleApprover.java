package com.ai.gof.behavioral.chainofresponsibility;

public class ArticleApprover extends Approver {
    @Override
    public void deploy(Course course) {
        if(course!=null && course.getArticle()!=null){
            System.out.println(course.getName()+"含有手记，批准");
            if(approver !=null){
                approver.deploy(course);
            }
        }else {
            System.out.println(course.getName()+"不包含手记，不批准");
            return;
        }
    }
}
