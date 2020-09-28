package com.api.demo.controllers;

import com.api.demo.domain.Task;
import com.api.demo.service.TaskService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(TaskController.BASE_URL)
public class TaskController {
    public static final  String BASE_URL = "/api/v1/tasks";
    private final TaskService  taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping
    List<Task> getAllTasks(){
        return taskService.findAllTasks();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Task saveTask(@PathVariable Long id){
        return taskService.findAllTasks(id);
    }

}
