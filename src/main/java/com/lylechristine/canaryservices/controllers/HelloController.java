package com.lylechristine.canaryservices.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class HelloController {

    @Value("${message.output}")
    String message;

    @Value("${sonar.login}")
    String sonarLogin;

    @GetMapping("/greeting")
    public String Greeting() {
        return "Hello from Canary Services!";
    }

    @GetMapping("/config")
    public String Config() {
        return sonarLogin;
    }


}
