package com.designpattern.abstractFactoryDesignPattern;

public class WebDevFactory extends AbstractEmployeeFactory{
    @Override
    public Employee createEmployee(String name, Integer salary) {
        return new WebDeveloper(name,salary);
    }
}
