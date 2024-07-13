package com.designpattern.SpringBoot.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Qualifier("TestServiceImpl")
public class TestServiceImpl implements TestService{
    @Override
    public String findClassName() {
        return "TestService Implementation class";
    }
}
