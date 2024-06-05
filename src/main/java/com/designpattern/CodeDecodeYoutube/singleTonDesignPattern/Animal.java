package com.designpattern.CodeDecodeYoutube.singleTonDesignPattern;

public class Animal {

    //This is eager way to create object
    private static final Animal animal = new Animal();

    private Animal() {
    }

    public static Animal getAnimalInstance() {
        return animal;
    }
}
