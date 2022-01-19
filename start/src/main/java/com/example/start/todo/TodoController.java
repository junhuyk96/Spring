package com.example.start.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.annotation.RequestScope;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Map;
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

    @PatchMapping("{id}")
    public ResponseEntity<?> updateItem(
            @PathVariable("id") Integer id,
            @RequestBody TodoUpdateItemDTO todoUpdateItemDTO
    ) {
        Optional<Todo> todo = this.todoService.updateItem(id, todoUpdateItemDTO);

        if (todo.isPresent()) return ResponseEntity.ok(todo);

        return ResponseEntity.badRequest().build();
    }

    @DeleteMapping("")
    public ResponseEntity<String> deleteItem(
            @RequestParam(name="id", required=false) Integer id
    ) {
        try {
            boolean isDelete = this.todoService.deleteItem(id);
            if(isDelete) return ResponseEntity.ok("success");
            else return ResponseEntity.badRequest().body("cna't find entity");
        } catch(Exception ex) {
            return ResponseEntity.badRequest().body("Inbalid Parameter");
        }
    }

    @GetMapping("complete")
    public List<Todo> findComplete() {
        return this.todoService.findComplete(true);
    }

    @GetMapping("not-complete")
    public List<Todo> findNotComplete() {
        return this.todoService.findComplete(false);
    }

    @GetMapping("contains")
    public List<Todo> findCompleteItemContains(String item) {
        return this.todoService.findItemContains(item);
    }

    @GetMapping("startswith")
    public List<Todo> findCompleteItemStartsWith(String item) {
        return this.todoService.findItemStartswith(item);
    }

    @GetMapping("endswith")
    public List<Todo> findCompleteItemEndsWith(String item) {
        return this.todoService.findItemEndswith(item);
    }

    @GetMapping("gtlt")
    public Map<String, List<Todo>> findGTLT(Integer id) {
        return this.todoService.findGTLT(id);
    }
}
