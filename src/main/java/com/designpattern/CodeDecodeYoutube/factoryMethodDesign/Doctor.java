package com.designpattern.CodeDecodeYoutube.factoryMethodDesign;

public class Doctor implements Profession {

    public Doctor() {
    }

    @Override
    public void printProfession() {
        System.out.println("Hello!, I'm Doctor");
    }
}
