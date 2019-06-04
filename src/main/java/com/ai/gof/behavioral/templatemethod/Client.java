package com.ai.gof.behavioral.templatemethod;

public class Client {
    public static void main(String[] args) {
        System.out.println("后端设计模式课程start----");
        ACourse designPatternCourse = new DesignPatternCourse();
        designPatternCourse.makeCourse();
        System.out.println("后端设计模式课程end----");

        System.out.println("前端设计模式课程start----");
        ACourse feCourse = new FECourse();
        feCourse.makeCourse();
        System.out.println("前端设计模式课程end----");
    }
}
