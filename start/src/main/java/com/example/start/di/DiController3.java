package com.example.start.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DiController3 {
    private DiService diService;

    @Autowired
    public void setDiService(DiService diService) {
        this.diService = diService;
    }

    @GetMapping("/di3")
    public int sumAllValues(Integer min, Integer max) {
        int sum = this.diService.sumAllValues(min, max);
        return sum;
    }
}
