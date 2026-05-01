package com.example.TaskManagerAPI.Service;

import com.example.TaskManagerAPI.Model.Task;
import com.example.TaskManagerAPI.Repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TaskService {
    private TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
        taskRepository.save(new Task(1l, "Learn Spring Boot", false));
        taskRepository.save(new Task(2l, "Build API", false));
    }



    public List<Task> getAllTasks() {

        return taskRepository.findAll();
    }
    public Task getTaskById(Long id) {
        return taskRepository.findById(id).orElse(null);
    }

    public Task createTask(Task task) {
        taskRepository.save(task);
        return task;
    }

    public boolean deleteTask(Long id) {
        if (!taskRepository.existsById(id)) {
            return false;
        }

        taskRepository.deleteById(id);
        return true;

    }

    public Task updateTask(Long id, Task updatedTask) {

        return taskRepository.findById(id)
                .map(task -> {
                    task.setTitle(updatedTask.getTitle());
                    task.setCompleted(updatedTask.isCompleted());
                    return taskRepository.save(task);
                })
                .orElse(null);
    }

    public List<Task> getCompletedTasks(boolean completed) {
        return taskRepository.findByCompleted(completed);
    }




}