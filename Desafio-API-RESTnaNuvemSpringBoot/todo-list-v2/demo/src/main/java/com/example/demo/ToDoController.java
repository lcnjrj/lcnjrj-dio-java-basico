package com.example.todolist.controller;

import com.example.todolist.model.ToDo;
import com.example.todolist.repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todos")
public class ToDoController {
    @Autowired
    private ToDoRepository toDoRepository;

    @GetMapping
    public List<ToDo> getAllTodos() {
        return toDoRepository.findAll();
    }

    @PostMapping
    public ToDo createTodo(@RequestBody ToDo toDo) {
        return toDoRepository.save(toDo);
    }

    @GetMapping("/{id}")
    public ToDo getTodoById(@PathVariable Long id) {
        return toDoRepository.findById(id).orElseThrow(() -> new RuntimeException("ToDo not found"));
    }

    @PutMapping("/{id}")
    public ToDo updateTodo(@PathVariable Long id, @RequestBody ToDo toDo) {
        ToDo existingToDo = toDoRepository.findById(id).orElseThrow(() -> new RuntimeException("ToDo not found"));
        existingToDo.setTask(toDo.getTask());
        existingToDo.setCompleted(toDo.isCompleted());
        return toDoRepository.save(existingToDo);
    }

    @DeleteMapping("/{id}")
    public void deleteTodo(@PathVariable Long id) {
        toDoRepository.deleteById(id);
    }
}
