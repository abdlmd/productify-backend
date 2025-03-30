package com.example.productify_backend.repo;

import com.example.productify_backend.model.Habit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HabitRepo extends JpaRepository<Habit,Integer> {
}
