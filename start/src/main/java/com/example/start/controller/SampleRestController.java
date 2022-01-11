package com.example.start.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class SampleRestController {
    @GetMapping("rest")
    public String index() {
        return "this is rest";
    }

    @GetMapping("rest/now")
    public LocalDateTime now() {
        return LocalDateTime.now();
    }
}
