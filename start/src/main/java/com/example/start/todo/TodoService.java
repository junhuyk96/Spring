package com.example.start.todo;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

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

    public Optional<Todo> updateItem(Integer id, TodoUpdateItemDTO todoUpdateItemDTO) {
        Optional<Todo> todo = this.todoRepository.findById(id);

        todo.ifPresent(t -> {
            if(todoUpdateItemDTO.getItem() != null) {
                t.setItem(todoUpdateItemDTO.getItem());
            }

            if(todoUpdateItemDTO.getIsComplete() != null) {
                t.setIsComplete(todoUpdateItemDTO.getIsComplete());
            }

            this.todoRepository.save(t);
        });

        return todo;
    }

    public boolean deleteItem(Integer id) throws IllegalArgumentException {
        Optional<Todo> todo = this. todoRepository.findById(id);
        if (todo.isPresent()) {
            this.todoRepository.delete(todo.get());
            return true;
        }

        return false;
    }

    public List<Todo> findComplete(boolean isComplete) {
        return this.todoRepository.findByIsComplete(isComplete);
    }

    public List<Todo> findItemContains(String item) {
        return this.todoRepository.findByItemContains(item);
    }

    public List<Todo> findItemStartswith(String item) {
        return this.todoRepository.findByItemStartsWith(item);
    }
}
