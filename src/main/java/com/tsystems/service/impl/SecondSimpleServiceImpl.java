package com.tsystems.service.impl;

import com.tsystems.service.SimpleService;

public class SecondSimpleServiceImpl implements SimpleService {

    @Override
    public String getHelloMessage() {
        return "second message";
    }
}
