package com.example.TaskManagerAPI.Model;

import jakarta.validation.constraints.NotBlank;

public class Task {
    private Long id;
    @NotBlank(message = "Title cannot be empty")
    private String title;
    private boolean completed;

    // constructors, getters, setters

    public Task(Long id, String title, boolean completed) {
        this.id = id;
        this.title = title;
        this.completed = completed;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}