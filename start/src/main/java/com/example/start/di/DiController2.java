package com.example.start.di;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DiController2 {
    private final DiService diService;

    public DiController2(DiService diService) {
        this.diService=diService;
    }

    @GetMapping("/di2")
    public int sumAllValues(Integer min, Integer max) {
        int sum = this.diService.sumAllValues(min, max);
        return sum;
    }
}
