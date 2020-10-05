package com.github.antoniodvr.startupactuatortest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    public HelloController() throws InterruptedException {
        Thread.sleep(3000); // For startup actuator test purpose
    }

    @GetMapping
    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }

}