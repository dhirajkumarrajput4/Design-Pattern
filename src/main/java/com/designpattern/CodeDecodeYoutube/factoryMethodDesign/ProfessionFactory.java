package com.designpattern.CodeDecodeYoutube.factoryMethodDesign;

public class ProfessionFactory {
    public Profession getProfession(String typeOfProfession) {
        if (typeOfProfession.equalsIgnoreCase("Doctor")) {
            return new Doctor();
        } else if (typeOfProfession.equalsIgnoreCase("Engineer")) {
            return new Engineer();
        }
        return null;
    }
}
