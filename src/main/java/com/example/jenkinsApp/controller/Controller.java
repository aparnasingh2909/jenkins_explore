package com.example.jenkinsApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    //default endpoint
    @GetMapping("/home")
    public String home()
    {
        return "homepage";
    }
}
