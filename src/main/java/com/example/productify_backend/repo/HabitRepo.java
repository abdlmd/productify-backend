package com.example.productify_backend.repo;

import com.example.productify_backend.model.Habit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HabitRepo extends JpaRepository<Habit,Integer> {
}
