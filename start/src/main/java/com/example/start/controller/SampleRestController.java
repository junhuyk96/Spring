package com.example.start.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class SampleRestController {
    @RequestMapping("request/{param}")
    public String Path(@PathVariable("param") String parameter) {
        return "입력 받은 String : " + parameter;
    }
}
