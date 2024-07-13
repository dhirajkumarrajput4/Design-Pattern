package com.designpattern.SpringBoot.controller;

import com.designpattern.SpringBoot.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Autowired
    @Qualifier("OtherImplementation")
    private TestService testService;

    @Autowired
    @Qualifier("TestServiceImpl")
    private TestService testServiceImpl;

    @GetMapping("/fetch")
    public ResponseEntity<?> getResponse() {
        return ResponseEntity.ok(testService.findClassName());
    }

    @GetMapping("/fetch2")
    public ResponseEntity<?> getResponsemore() {
        return ResponseEntity.ok(testServiceImpl.findClassName());
    }
}
