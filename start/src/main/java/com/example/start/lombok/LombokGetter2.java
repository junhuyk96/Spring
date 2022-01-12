package com.example.start.lombok;

import lombok.Getter;

@Getter
public class LombokGetter2 {
    private Integer id;
    private String item;
    private Boolean isComplete;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public void setIsComplete(Boolean isComplete) {
        this.isComplete = isComplete;
    }
}
