package com.example.TaskManagerAPI.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class TaskController {

    @GetMapping("/tasks")
    public String getTasks() {
        return "Task list coming soon";
    }

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }
}