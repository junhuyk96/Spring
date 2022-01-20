package com.example.Member.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {
    @GetMapping("input")
    public String input_name(@RequestParam("name") String name) {
        return "name : " + name;
    }
}
