package com.example.productify_backend.service;

import com.example.productify_backend.model.Task;
import com.example.productify_backend.repo.TaskRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
        @Autowired
        private TaskRepo repo;
    public List<Task> getAllTasks() {
        return repo.findAll();

    }
}
