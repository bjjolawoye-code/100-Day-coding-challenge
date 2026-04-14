package com.example.TaskManagerAPI.Service;

import com.example.TaskManagerAPI.Model.Task;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TaskService {

    private List<Task> tasks = new ArrayList<>();

    public TaskService() {
        tasks.add(new Task(1L, "Learn Spring Boot", false));
        tasks.add(new Task(2L, "Build API", false));
    }

    public List<Task> getAllTasks() {
        return tasks;
    }

    public Task createTask(Task task) {
        tasks.add(task);
        return task;
    }
}