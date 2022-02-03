package com.example.auth.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @GetMapping("oauth-test")
    public ResponseEntity<String> getMessage() {
        return ResponseEntity.ok().body("hello world");
    }
}
