package com.designpattern.CodeDecodeYoutube.singleTonDesignPattern;

public class MainClass {
    public static void main(String[] args) {
        //for eager loading
        Animal animalInstance = Animal.getAnimalInstance();
        System.out.println(animalInstance.hashCode());
        Animal animalInstance1 = Animal.getAnimalInstance();
        System.out.println(animalInstance1.hashCode());

        //want to lazy loading create object
        Car carInstance = Car.getCarInstance();
        System.out.println(carInstance.hashCode());

        Car carInstance1 = Car.getCarInstance();
        System.out.println(carInstance1.hashCode());
    }
}
