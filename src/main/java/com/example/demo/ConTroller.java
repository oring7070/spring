package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConTroller {
    @GetMapping("/hello")
    public String home() {
        return "Hello Spring Boot";
    }
}
