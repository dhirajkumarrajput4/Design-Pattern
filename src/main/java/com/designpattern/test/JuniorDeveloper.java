package com.designpattern.test;

public class JuniorDeveloper implements Employee{

    private String name;

    private Integer salary;

    public JuniorDeveloper(String name, Integer salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    @Override
    public String getEmployeeName() {
        return getName();
    }

    @Override
    public Integer getEmployeeSalary() {
        return getSalary();
    }
}
