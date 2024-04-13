package com.tmaxnoda.springboot.starter.starter.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    // expose "/" endpoint that return "Hello World"
    @GetMapping("/")
    public String Greetings(){
        return "Hello Wold!";
    }
}
