package com.example.start.todo;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TodoService {
    private TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public Todo add(String item) {
        Todo todo = new Todo();
        todo.setItem(item);
        todo.setIsComplete(false);

        todo = this.todoRepository.save(todo);
        return todo;
    }

    public List<Todo> all() {
        return this.todoRepository.findAll();
    }

    public Optional<Todo> find(Integer id) {
        return this.todoRepository.findById(id);
    }
}
