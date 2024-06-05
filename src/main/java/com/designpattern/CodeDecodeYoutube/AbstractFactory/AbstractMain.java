package com.designpattern.CodeDecodeYoutube.AbstractFactory;

public class AbstractMain {
    public static void main(String[] args){
        AbstractFactory profession = AbstracFactoryProducer.getProfession(false);
        Profession engineer = profession.getProfession("Engineer");
        engineer.printProfession();

        AbstractFactory profession1 = AbstracFactoryProducer.getProfession(false);
        Profession teacher = profession1.getProfession("Teacher");
        teacher.printProfession();
    }
}
