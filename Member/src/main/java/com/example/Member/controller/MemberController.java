package com.example.Member.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {
    @GetMapping("/spring")
    public String sample() {
        return "No Way";
    }

}
