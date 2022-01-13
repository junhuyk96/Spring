package com.example.start.lombok;

import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@ToString
public class LombokNoArgs {
    private Integer id;
    private String item;
    private Boolean isComplete;

    public LombokNoArgs(Boolean isComplete) {
        this.isComplete = isComplete;
    }
}
