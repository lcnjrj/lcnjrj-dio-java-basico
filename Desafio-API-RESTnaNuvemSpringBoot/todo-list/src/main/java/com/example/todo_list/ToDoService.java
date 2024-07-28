// src/main/java/com/example/todolist/service/ToDoService.java
package com.example.todolist.service;

import com.example.todolist.model.ToDo;
import com.example.todolist.repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ToDoService {

    @Autowired
    private ToDoRepository toDoRepository;

    public List<ToDo> getAllToDos() {
        return toDoRepository.findAll();
    }

    public Optional<ToDo> getToDoById(Long id) {
        return toDoRepository.findById(id);
    }

    public ToDo createToDo(ToDo toDo) {
        return toDoRepository.save(toDo);
    }

    public ToDo updateToDo(Long id, ToDo toDo) {
        if (toDoRepository.existsById(id)) {
            toDo.setId(id);
            return toDoRepository.save(toDo);
        }
        return null;
    }

    public void deleteToDoById(Long id) {
        toDoRepository.deleteById(id);
    }
}
