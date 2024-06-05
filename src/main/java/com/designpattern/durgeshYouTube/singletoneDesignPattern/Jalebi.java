package com.designpattern.durgeshYouTube.singletoneDesignPattern;

public class Jalebi {

    private Jalebi() {

    }
    //This is eager way to create singleton object an object
    private static Jalebi jalebi = new Jalebi();

    public static Jalebi getJalebiIntance() {
        return jalebi;
    }
}
