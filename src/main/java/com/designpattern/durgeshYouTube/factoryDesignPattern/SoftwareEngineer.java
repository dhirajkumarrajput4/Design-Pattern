package com.designpattern.durgeshYouTube.factoryDesignPattern;

public class SoftwareEngineer implements Employee {

    private String name;

    private Integer sallary;

    public SoftwareEngineer(String name, Integer sallary) {
        this.name = name;
        this.sallary = sallary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSallary() {
        return sallary;
    }

    public void setSallary(Integer sallary) {
        this.sallary = sallary;
    }

    @Override
    public String getEmployeeName() {
        return getName();
    }

    @Override
    public Integer getEmployeeSalary() {
        return getSallary();
    }

    @Override
    public String toString() {
        return "SoftwareEngineer{" +
                "name='" + name + '\'' +
                ", sallary=" + sallary +
                '}';
    }
}
