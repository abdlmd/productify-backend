package com.example.productify_backend.repo;

import com.example.productify_backend.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteRepo extends JpaRepository<Note,Integer> {
}
