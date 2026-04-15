package com.example.TaskManagerAPI.Service;

import com.example.TaskManagerAPI.Model.Task;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TaskService {

    private List<Task> tasks = new ArrayList<>();
    private Long nextId = 1L;

    public TaskService() {
        tasks.add(new Task(1l, "Learn Spring Boot", false));
        tasks.add(new Task(2l, "Build API", false));
    }

    public List<Task> getAllTasks() {
        return tasks;
    }
    public Task getTaskById(Long id) {
        for (Task task : tasks) {
            if (task.getId().equals(id)) {
                return task;
            }
        }
        return null;
    }

    public Task createTask(Task task) {
        task.setId(nextId++);
        tasks.add(task);
        return task;
    }


}