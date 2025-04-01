package com.example.productify_backend.controller;

import com.example.productify_backend.model.Habit;
import com.example.productify_backend.model.Task;
import com.example.productify_backend.service.HabitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class HabitController {
    @Autowired
   private HabitService service;
    @PostMapping("/habit")
    public ResponseEntity<Habit> createHabit(@RequestBody Habit habit){
        return new ResponseEntity<>(service.createHabit(habit), HttpStatus.OK);
    }
    @GetMapping("/habit")
    public ResponseEntity<List<Habit>> getAllHabits(){
        return new ResponseEntity<>(service.getAllHabits(),HttpStatus.OK);
    }
    @PutMapping("/habit/{id}")
    public ResponseEntity<Habit> updateStreak(@PathVariable int id){
        return new ResponseEntity<>(service.updateStreak(id),HttpStatus.OK);
    }
    @DeleteMapping("/habit/{id}")
    public ResponseEntity<String> deleteHabit(@PathVariable int id){
        service.deleteHabit(id);
        return new ResponseEntity<>("Habit Deleted",HttpStatus.OK);
    }

}
