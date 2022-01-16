package com.example.start.todo;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TodoRepository extends JpaRepository<Todo, Integer> {
    List<Todo> findByIsComplete(boolean isComplete);
    List<Todo> findByItemContains(String item);
    List<Todo> findByItemStartsWith(String item);
}
