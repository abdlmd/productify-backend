package com.example.productify_backend.service;

import com.example.productify_backend.model.Note;
import com.example.productify_backend.repo.NoteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NoteService {
    @Autowired
    NoteRepo repo;
    public Note createNewNote(Note note) {
        return repo.save(note);

    }
}
