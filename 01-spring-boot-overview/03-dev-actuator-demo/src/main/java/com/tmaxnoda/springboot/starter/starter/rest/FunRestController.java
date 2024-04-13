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

    //expose new endpoint for workout
    @GetMapping("/workout")
    public String getDailyWorkout(){
        return "Run a hard 5K!";
    }

    // expose a new endpoint for "Fortune"
    @GetMapping("/fortune")
    public String getDailyFortune(){
        return "Today is your lucky day!.";
    }
}
