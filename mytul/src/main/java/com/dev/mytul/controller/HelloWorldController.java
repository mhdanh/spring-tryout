package com.dev.mytul.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/v1/hello")
public class HelloWorldController {

    @GetMapping
    public String sayHello() {
       return "Hi, there!";
    }

}
