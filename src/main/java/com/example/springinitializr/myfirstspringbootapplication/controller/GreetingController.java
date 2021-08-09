package com.example.springinitializr.myfirstspringbootapplication.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @RequestMapping("/")
    public String getGreeting() {
        return "This is my first Spring Boot Application!";
    }
}
