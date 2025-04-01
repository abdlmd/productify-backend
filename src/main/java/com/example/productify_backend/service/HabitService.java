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

    public Habit updateStreak(int id) {
        Habit h1= repo.findById(id).orElse(null);
        h1.setStreakDays(h1.getStreakDays()+1);
        h1.setCompletedToday(true);
        repo.save(h1);
        return h1;

    }
}
