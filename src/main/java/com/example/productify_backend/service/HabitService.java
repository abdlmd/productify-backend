package com.example.productify_backend.service;

import com.example.productify_backend.model.Habit;
import com.example.productify_backend.repo.HabitRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HabitService {
    @Autowired
    private HabitRepo repo;
    public Habit createHabit(Habit habit) {
       return repo.save(habit);

    }

    public List<Habit> getAllHabits() {
        return repo.findAll();
    }

    public void deleteHabit(int id) {
        repo.deleteById(id);
    }

    public Habit updateStreak(Habit habit) {
        habit.setStreakDays(habit.getStreakDays()+1);
        repo.save(habit);
        return habit;

    }
}
