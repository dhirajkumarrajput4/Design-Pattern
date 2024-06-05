package com.designpattern.CodeDecodeYoutube.factoryMethodDesign;

public class FactoryMain {
    public static void main(String[] arg) {
        ProfessionFactory professionFactory = new ProfessionFactory();
        Profession doctor = professionFactory.getProfession("Doctor");
        doctor.printProfession();
        Profession engineer = professionFactory.getProfession("Engineer");
        engineer.printProfession();
    }
}
