package com.example.start.todo;

import lombok.Data;

@Data
public class TodoUpdateItemDTO {
    private String item;
    private Boolean isComplete;
}
