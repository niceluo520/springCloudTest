package com.study.server.service.impl;

import com.study.server.service.TestService;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

    @Override
    public String get(String name) {
        return "名字："+name;
    }
}
