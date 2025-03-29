package com.example.productify_backend.service;

import com.example.productify_backend.model.Note;
import com.example.productify_backend.repo.NoteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteService {
    @Autowired
    NoteRepo repo;
    public Note createNewNote(Note note) {
        return repo.save(note);
    }
    public List<Note> getAllNotes() {
        return repo.findAll();
    }

    public Note updateNote(Note note) {
        return repo.save(note);
    }

    public void deleteNote(int id) {
        repo.deleteById(id);
    }
}
