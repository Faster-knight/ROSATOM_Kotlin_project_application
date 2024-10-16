package com.example.main.controllers;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("/api")
public class ApiController {
    @GetMapping("")
    public ResponseEntity<HashMap<String, Object>> apiRoute() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HashMap<String, Object> body = new HashMap<>();
        body.put("msg", "Application backend work!");
        return new ResponseEntity<>(body, headers, HttpStatus.OK);
    }
}
