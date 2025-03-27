package com.moodmix.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

import java.util.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/spotify")
public class SpotifyController {

    @Value("${spotify.client.id}")
    private String clientId;

    @Value("${spotify.client.secret}")
    private String clientSecret;

    @GetMapping("/credentials")
    public ResponseEntity<Map<String, String>> getSpotifyCredentials() {
        try {
            Map<String, String> response = new HashMap<>();
            response.put("clientId", clientId);
            response.put("clientSecret", clientSecret);
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    }
}
