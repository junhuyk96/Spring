package com.example.start.lombok;

import lombok.Setter;
import lombok.ToString;

@Setter
@ToString
public class LombokSetter {
    private Integer id;
    private String item;
    private Boolean isComplete;
}
