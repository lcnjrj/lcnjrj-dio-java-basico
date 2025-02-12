// src/main/java/com/example/todolist/repository/ToDoRepository.java
package com.example.todolist.repository;

import com.example.todolist.model.ToDo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToDoRepository extends JpaRepository<ToDo, Long> {
}
