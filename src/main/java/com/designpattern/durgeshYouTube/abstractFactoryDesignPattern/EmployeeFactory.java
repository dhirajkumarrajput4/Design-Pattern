package com.designpattern.durgeshYouTube.abstractFactoryDesignPattern;

public class EmployeeFactory {
    public static Employee getEmployee(AbstractEmployeeFactory abstractEmployeeFactory, String name, Integer salary) {
        return abstractEmployeeFactory.createEmployee(name, salary);
    }
}
