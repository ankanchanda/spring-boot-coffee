package com.coffee.coffee.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/greeting")
public class GreetingController {
    
    @Value("${greeting-name: Mirage}")
    private String name;

    @Value("${greeting-coffee: ${greeting-name} is drinking latte}")
    private String coffee;

    @GetMapping
    String getGreeting(){
        return name;
    }

    @GetMapping("/coffee")
    public String getCoffee() {
        return coffee;
    }
    
}
