package com.study.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

/**
 *   @ComponentScan 这个注解是把server的api交给spring管理，自动装配bean
 */
@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan(basePackages = {"com.study"})
public class WebApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class, args);
    }

}
