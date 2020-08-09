package com.huangda7.dockeimage.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloImageController {
    @GetMapping(path = "/hello")
    public String helloDockerImage() {
        return "Hello Docker Image!";
    }
}
