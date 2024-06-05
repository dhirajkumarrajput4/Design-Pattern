package com.designpattern.CodeDecodeYoutube.AbstractFactory;

public class AbstracFactoryProducer {
    public static AbstractFactory getProfession(boolean isTrainee) {
        if (isTrainee) {
            return new TraneeProfessionAbstractFactory();
        } else {
            return new ProfessionAbstractFactory();
        }
    }
}
