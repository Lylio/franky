package com.lylechristine.canaryservices.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v2")
public class WelcomeControllerV2 {

    @RequestMapping("/welcome")
    public String welcome() {
        return "<h1>WELCOME from the V2 API! OHHHH YEEEAAAAAAA!</H1>" +
                "<br>" +
                "<br>" +
                "<ul>" +
                "<li><a href=\"/api/v2/greeting\">Greeting</a></li>" +
                "<li><a href=\"/api/v2/config\">Config</a></li>" +
                "<li><a href=\"/api/v2/logger\">Logger</a></li>" +
                "</ul>";
    }
}
