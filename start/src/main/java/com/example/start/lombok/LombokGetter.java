package com.example.start.lombok;

import lombok.Getter;

public class LombokGetter {
    @Getter
    private Integer id;
    private String item;
    private Boolean isComplete;

    public void setId(Integer id) {
        this.id = id;
    }
}
