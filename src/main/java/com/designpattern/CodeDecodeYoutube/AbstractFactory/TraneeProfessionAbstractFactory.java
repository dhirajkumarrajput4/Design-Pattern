package com.designpattern.CodeDecodeYoutube.AbstractFactory;

public class TraneeProfessionAbstractFactory extends AbstractFactory {

    @Override
    Profession getProfession(String typeOfProfession) {
        if (typeOfProfession.equalsIgnoreCase("Teacher")) {
            return new TraneeTeacher();
        } else if (typeOfProfession.equalsIgnoreCase("Engineer")) {
            return new TraneeEngineer();
        }
        return null;
    }
}
