package com.example.productify_backend.controller;

import com.example.productify_backend.model.Task;
import com.example.productify_backend.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class TaskController {
    @Autowired
    private TaskService service;
    @PostMapping("/tasks")
    public ResponseEntity<?> createTask(@RequestBody Task task){
        return new ResponseEntity<>(service.createTask(task),HttpStatus.CREATED);
    }
    @GetMapping("/tasks")
    public ResponseEntity<List<Task>> getAllTasks(){
        return new ResponseEntity<>(service.getAllTasks(), HttpStatus.OK);
    }
    @PutMapping("/tasks/{id}")
    public ResponseEntity<?> updateCompleteStatus(@PathVariable int id){
        return new ResponseEntity<>(service.updateCompleteStatus(id),HttpStatus.OK);
    }


    @DeleteMapping("/tasks/{id}")
    public ResponseEntity<String> deleteTask(@PathVariable int id){
        service.deleteTask(id);
        return new ResponseEntity<>("Task Deleted",HttpStatus.OK);
    }
}
