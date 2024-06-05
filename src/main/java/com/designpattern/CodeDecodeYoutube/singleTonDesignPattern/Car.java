package com.designpattern.CodeDecodeYoutube.singleTonDesignPattern;

public class Car {
    private static Car car = null;

    private Car() {

    }

    //this method is not thread safe
    public static Car getCarInstance() {
        if (car == null) {
            car = new Car();
        }
        return car;
    }

    //for threading use
    public static Car getCarInstanceForThreading() {
        synchronized (Car.class) {
            if (car == null) {
                car = new Car();
            }
            return car;
        }
    }
}
