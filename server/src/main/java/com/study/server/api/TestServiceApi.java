package com.study.server.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name="server-service",contextId = "TestServiceApi")
public interface TestServiceApi {

    @RequestMapping("/test/get")
    String get(String name);
}
