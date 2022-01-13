package com.example.start.lombok;

import lombok.AllArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor
@AllArgsConstructor
@ToString
public class LombokHasArgs {
    private Integer id;
    @NonNull
    private String item;
    private Boolean isComplete;
}
