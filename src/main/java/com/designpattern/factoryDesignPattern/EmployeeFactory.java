package com.designpattern.factoryDesignPattern;

public class EmployeeFactory {

    public static Employee getEmployee(String empType, String name, Integer salary) {
        if(empType.trim().equalsIgnoreCase("Junior Developer")){
            return new JuniorDeveloper(name,salary);
        } else if (empType.trim().equalsIgnoreCase("Software Engineer")) {
            return new SoftwareEngineer(name,salary);
        }else {
            return null;
        }
    }
}
