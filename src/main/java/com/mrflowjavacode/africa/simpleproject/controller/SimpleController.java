package com.mrflowjavacode.africa.simpleproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/project")
@Controller
public class SimpleController {


    @GetMapping("/hello_world")
    public String helloWorld(){
        return "Hello world";
    }
}
