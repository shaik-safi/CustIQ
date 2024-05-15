package com.shaik.custiq.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Hello {
    @GetMapping("/hi")
    public ResponseEntity<String> hi() {
        return ResponseEntity.ok("hi");
    }
}
