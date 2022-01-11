package com.example.start.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping(value="/class/request")
public class SampleClassRequestMapping {
    @GetMapping("/")
    public String index() {
        return "this is sample class Request Mapping";
    }

    @GetMapping("/now")
    public LocalDateTime now() {
        return LocalDateTime.now();
    }
}
