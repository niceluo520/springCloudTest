package com.study.web.controller;


import com.study.server.api.TestServiceApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestWebController {

    @Value("${aa.bb}")
    String value;

    @Autowired
    private TestServiceApi testServiceApi;

    @RequestMapping("/getTest")
    public String getTest(){
        return testServiceApi.get("这是web的");
    }

    @RequestMapping("/value")
    public String getValue(){
        return "value:" + value;
    }
}
