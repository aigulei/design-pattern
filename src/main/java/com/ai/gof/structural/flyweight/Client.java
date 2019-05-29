package com.ai.gof.structural.flyweight;

public class Client {
    private static final String departments[] = {"RD","QA","PM","PD"};

    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            String department = departments[(int)(Math.random() * departments.length)];
            Manager manager = (Manager) EmployeeFactory.getManager(department);
            manager.report();
        }
    }
}
