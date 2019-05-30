package com.ai.gof.structural.compose;

public class Client {

    public static void main(String[] args) {
        CatalogComponent linuxCourse = new Course("linux",69.00);
        CatalogComponent javaCourse = new Course("java",89.00);
        CatalogComponent courseCatalog = new CourseCatalog("course catalog");
        courseCatalog.add(linuxCourse);
        courseCatalog.add(javaCourse);
        courseCatalog.print();
    }
}
