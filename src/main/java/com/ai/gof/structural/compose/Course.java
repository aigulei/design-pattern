package com.ai.gof.structural.compose;

public class Course extends  CatalogComponent {
    private String name;
    private double price;

    public Course(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName(CatalogComponent component) {
        return this.name;
    }

    @Override
    public double getPrice(CatalogComponent component) {
        return this.price;
    }

    @Override
    public void print() {
        System.out.println("Course Name:"+name+":Course Price:"+price);
    }
}
