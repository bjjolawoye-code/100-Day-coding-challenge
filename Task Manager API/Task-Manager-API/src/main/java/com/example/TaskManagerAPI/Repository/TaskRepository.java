package com.example.TaskManagerAPI.Repository;

import com.example.TaskManagerAPI.Model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findByCompleted(boolean completed);
    Task findByTitle(String title);


}