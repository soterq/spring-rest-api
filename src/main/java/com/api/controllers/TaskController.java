package com.api.controllers;

import com.api.domain.Task;
import com.api.domain.dto.TaskDTO;
import com.api.service.TaskService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(TaskController.BASE_URL)
@CrossOrigin
public class TaskController {
    public static final String BASE_URL = "/api/v1/tasks";
    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping
    List<TaskDTO> getAllTasks() {
        return taskService.findTasks();
    }

    @GetMapping("/{id}")
    public TaskDTO findTaskById(@PathVariable Long id) {
        return taskService.findTask(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
//    public TaskDTO saveTask(@RequestBody TaskDTO task) {
    public Task saveTask(@RequestBody TaskDTO task) {
        return taskService.saveTask(task);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteTask(@PathVariable Long id) {
        taskService.deleteTask(id);
    }

}
