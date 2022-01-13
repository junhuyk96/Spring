package com.example.start.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("todo")
public class TodoController {
    @Autowired
    private TodoService todoService;

    @RequestMapping("add")
    public ResponseEntity<Todo> add(String item) {
        Todo todo = this.todoService.add(item);
        return ResponseEntity.ok(todo);
    }

    @GetMapping("all")
    public List<Todo> all() {
        List<Todo> todoList = this.todoService.all();
        return todoList;
    }

    @GetMapping("find/{id}")
    public ResponseEntity<?> find(@PathVariable("id") Integer id) {
        Optional<Todo> todo = this.todoService.find(id);
        if(todo.isPresent()) {
            return ResponseEntity.ok(todo);
        }
        return ResponseEntity.badRequest().build();
    }
}
