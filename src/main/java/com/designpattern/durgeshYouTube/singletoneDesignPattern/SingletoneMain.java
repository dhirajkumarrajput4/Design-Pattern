package com.designpattern.durgeshYouTube.singletoneDesignPattern;

public class SingletoneMain {
    public static void main(String[] args){
        Samosa instance = Samosa.getInstance();
        System.out.println(instance.hashCode());

        Samosa instance1 = Samosa.getInstance();
        System.out.println(instance1.hashCode());


        Jalebi jalebiIntance = Jalebi.getJalebiIntance();
        Jalebi jalebiIntance1 = Jalebi.getJalebiIntance();
        System.out.println(jalebiIntance.hashCode());
        System.out.println(jalebiIntance1.hashCode());


/*
* We can break the singleton design pattern using reflection api
*
*
* */
    }
}
