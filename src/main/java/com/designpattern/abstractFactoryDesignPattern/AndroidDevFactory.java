package com.designpattern.abstractFactoryDesignPattern;

public class AndroidDevFactory extends AbstractEmployeeFactory {

    @Override
    public Employee createEmployee(String name, Integer salary) {
        return new AndroidDeveloper(name, salary);
    }
}
