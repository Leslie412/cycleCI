package com.example.circleCi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.net.http.HttpClient;

@Controller
public class CircleCIController {
    HttpClient httpClient;


    @GetMapping("/")
    public String hello() {
        return "index";
    }

    @GetMapping("/pressbtn")
    public String message(Model model){
        model.addAttribute("message", "You've pressed button!");
        return "index";
    }
}
