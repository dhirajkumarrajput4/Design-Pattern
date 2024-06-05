package com.designpattern.CodeDecodeYoutube.factoryMethodDesign;

public class Engineer implements Profession {

    public Engineer() {
    }

    @Override
    public void printProfession() {
        System.out.println("Hello!, I'm Engineer");
    }
}
