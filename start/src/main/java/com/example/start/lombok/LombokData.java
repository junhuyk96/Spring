package com.example.start.lombok;

import lombok.Data;

@Data
public class LombokData {
    private final Integer id;
    private String item;
    private Boolean isComplete;
}
