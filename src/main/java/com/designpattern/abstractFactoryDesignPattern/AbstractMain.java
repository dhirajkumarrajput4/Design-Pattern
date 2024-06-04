package com.designpattern.abstractFactoryDesignPattern;

public class AbstractMain {
    public static void main(String[] args){
        Employee emp1 = EmployeeFactory.getEmployee(new AndroidDevFactory(), "Dhiraj", 1000000);
        Employee emp2 = EmployeeFactory.getEmployee(new WebDevFactory(), "Rajesh", 1000000);
        System.out.println(emp1);
        System.out.println(emp2);
    }
}
