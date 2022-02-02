package com.example.auth.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.RolesAllowed;

@RestController
public class AuthController {

    @GetMapping("hello-world")
    @RolesAllowed("user")
    public ResponseEntity<String> getMessage() {
        return ResponseEntity.ok().body("hello world");
    }
}
