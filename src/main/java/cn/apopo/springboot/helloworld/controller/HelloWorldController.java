/*
 * Copyright (C) 2016 Baidu, Inc. All Rights Reserved.
 */
package cn.apopo.springboot.helloworld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by youke1987 on 2016/12/6.
 */
@RestController
public class HelloWorldController {

    private String helloWorld = "Hello Spring Boot!";

    @RequestMapping("/home")
    public String home() {
        return helloWorld;
    }
}
