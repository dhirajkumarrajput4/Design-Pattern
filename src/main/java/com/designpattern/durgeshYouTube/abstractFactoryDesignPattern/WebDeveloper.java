package com.designpattern.durgeshYouTube.abstractFactoryDesignPattern;

public class WebDeveloper implements Employee {
    private String name;
    private Integer salary;

    public WebDeveloper(String name, Integer salary) {
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

    @Override
    public String toString() {
        return "WebDeveloper{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
