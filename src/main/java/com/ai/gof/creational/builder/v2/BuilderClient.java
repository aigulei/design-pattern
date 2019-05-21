package com.ai.gof.creational.builder.v2;

public class BuilderClient {

    public static void main(String[] args) {
        Course course = new Course.CourseBuilder().buidlCourseQA("JavaQa")
                .buildCourseArticle("JavaArticle").buildCourseName("JavaName")
                .buildCoursePPT("JavaPPT").buildCourseVideo("JavaVideo").build();
        System.out.println(course);
    }
}
