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

    @GetMapping("/greeting")
    public String Greeting() {
        return "<h1>Hello from Canary Services!</h1>";
    }

    @GetMapping("/config")
    public String Config() {
        return "<h1>" + message + "</h1>";
    }


}
