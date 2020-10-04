package com.k8s.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {


    @Value("${spring.application.name}")
    private String applicationName;

    @Value("${spring.datasource.username}")
    private String userName;

    @Value("${spring.datasource.password}")
    private String pwd;


    @GetMapping("configmap")
    public String getConfig() {
        return  "application name : " + applicationName;
    }


    @GetMapping("secret")
    public String getSecret() {
        return "userName : " + userName + ",\n pwd : " + pwd;
    }
}
