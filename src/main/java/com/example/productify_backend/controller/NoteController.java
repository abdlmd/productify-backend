package com.example.productify_backend.controller;

import com.example.productify_backend.model.Note;
import com.example.productify_backend.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class NoteController {
    @Autowired
    private NoteService service;
    @PostMapping("/note")
    public ResponseEntity<?> createNewNote(@RequestBody Note note){
        if(note!=null)
        return new ResponseEntity<>(service.createNewNote(note), HttpStatus.CREATED);
        else
            return new ResponseEntity<>("Error creating a note",HttpStatus.BAD_REQUEST);

    }
}
