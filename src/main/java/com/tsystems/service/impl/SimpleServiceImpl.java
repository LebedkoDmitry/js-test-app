package com.tsystems.service.impl;

import com.tsystems.repositories.SimpleRepository;
import com.tsystems.service.SimpleService;

import java.util.Objects;

public class SimpleServiceImpl implements SimpleService {

    private final SimpleRepository simpleRepository;

    public SimpleServiceImpl(SimpleRepository simpleRepository) {
        this.simpleRepository = Objects.requireNonNull(simpleRepository);
    }

    public void init() {
        System.out.println("init method in SimpleServiceImpl");
    }

    public void destroy() {
        System.out.println("destroy method in SimpleServiceImpl");
    }

    @Override
    public String getHelloMessage() {
        return simpleRepository.getMessage();
    }
}
