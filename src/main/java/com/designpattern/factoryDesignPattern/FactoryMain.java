package com.designpattern.factoryDesignPattern;

public class FactoryMain {
    public static void main(String[] agr){
        Employee employee = EmployeeFactory.getEmployee("Junior Developer", "Mahesh", 110000);
        Employee employee2 = EmployeeFactory.getEmployee("Software Engineer", "Ramesh", 250000);
        System.out.println(employee2.toString());
        System.out.println(employee.toString());
    }
}
