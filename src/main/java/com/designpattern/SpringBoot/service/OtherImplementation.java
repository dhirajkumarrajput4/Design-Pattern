package com.designpattern.SpringBoot.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("OtherImplementation")
public class OtherImplementation implements TestService{
    @Override
    public String findClassName() {
        return "This is Other Implementation Class";
    }
}
