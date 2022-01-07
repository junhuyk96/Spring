package com.example.practice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PracController {
    @GetMapping("Step1")
    public String step1(Model model) {
        model.addAttribute("data", "hello!!");
        return "Step1";
    }
}
