package com.ai.gof.creational.builder;

public class BuilderClient {
    public static void main(String[] args) {
        CourseBuilder builder = new CourseActualBuilder();
        Coach coach = new Coach();
        coach.setCourseBuilder(builder);
        Course course = coach.makeCourse("Java设计模式","JavaPPT","JavaVideo"
                ,"JavaArticle","JavaQA");
        System.out.println(course);
    }
}
