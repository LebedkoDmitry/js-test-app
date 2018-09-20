package com.tsystems.annotated.service.impl;

import com.tsystems.annotated.service.AnnotatedService;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class AnnotatedServiceImpl implements AnnotatedService {

    @PostConstruct
    public void init() {
        System.out.println("init method");
    }

    @Override
    public String sayHello() {
        return "Hello from annotated service.";
    }
}
