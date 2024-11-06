package com.emreozel.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping
public class DevOpsController {

    @GetMapping
    public String devopsHello(){
        System.out.println(LocalDateTime.now());
        return "Hello World " + LocalDateTime.now();
    }

    @GetMapping("/info")
    public String devopsInfo(){
        System.out.println("INFO " + LocalDateTime.now());
        return "INFO " + LocalDateTime.now();
    }

}
