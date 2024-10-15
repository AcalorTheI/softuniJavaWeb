package com.example.Spring.Boot.exercise.MVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("/")
    public String getIndexPage() {
        return "index.html";
    }
}
