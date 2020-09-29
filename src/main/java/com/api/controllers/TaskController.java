package com.api.controllers;

import com.api.domain.Task;
import com.api.service.TaskService;
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
        return taskService.findTask();
    }

    @GetMapping("/{id}")
    public Task findTaskById(@PathVariable Long id){
        return taskService.findTask(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Task saveTask(@RequestBody Task task){
        return taskService.saveTask(task);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteTask(@PathVariable Long id){
        taskService.deleteTask(id);
    }

}
