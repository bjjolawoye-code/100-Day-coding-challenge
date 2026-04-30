package com.example.TaskManagerAPI.Repository;

import com.example.TaskManagerAPI.Model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}