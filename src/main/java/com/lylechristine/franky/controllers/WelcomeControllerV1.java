package com.lylechristine.franky.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class WelcomeControllerV1 {

    @RequestMapping("/welcome")
    public String welcome() {
        return "<h1>WELCOME from the V1 API! This API is now superseded by <a href=\"/api/v2/welcome\">/api/v2/</a></H1>";

    }
}

