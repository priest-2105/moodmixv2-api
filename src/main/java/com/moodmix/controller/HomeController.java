package com.moodmix.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    
    @GetMapping("/")
    public String home() {
        return "MoodMix API is running. Available endpoints: /api/spotify/credentials";
    }
}
