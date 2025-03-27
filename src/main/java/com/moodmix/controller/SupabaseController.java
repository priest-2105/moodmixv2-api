
package com.moodmix.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

import java.util.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/supabase")
public class SupabaseController {

    @Value("${supase.client.dburl}")
    private String supabaseurl;
    
    @Value("${supase.client.anonkey}")
    private String supabaseanonkey;
    

    @GetMapping("/credentials")
    public ResponseEntity<Map<String, String>> getSpotifyCredentials() {
        try {
            Map<String, String> response = new HashMap<>();
            response.put("supabasedburl", supabaseurl);
            response.put("supabaseanonkey", supabaseanonkey);
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    }
    
}
