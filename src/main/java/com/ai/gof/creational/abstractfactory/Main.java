package com.ai.gof.creational.abstractfactory;

public class Main {
    public static void main(String[] args) {
        CourseFactory factory = new JavaCourseFactory();
        factory.getArticle().produce();
        factory.getVideo().produce();

        factory = new PythonCourseFactory();
        factory.getArticle().produce();
        factory.getVideo().produce();
    }
}
