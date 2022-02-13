package com.lylechristine.franky.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController {

    @RequestMapping("/")
    public String rootMessage() {
        return "<h1>Welcome to the Root Landing Page!</h1>" +
                "<br><a href=\"/api/v1/welcome\">/api/v1/welcome</a>" +
                "<br><br> also, try /{name} e.g. http://localhost:8080/ARTHUR or http://localhost:8080/SUSAN";
    }

    @GetMapping("/{name}")
        public String greeting (@PathVariable("name") String name) {
            return "<h1>HULLO " + name + ", YOU MASSIVE SHIT ARSE!!!</h2>" +
                    "<br><br><a href=\"/api/v1/welcome\">/api/v1/welcome</a>";
        }
}
