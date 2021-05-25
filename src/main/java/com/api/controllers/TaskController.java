package com.api.controllers;

import com.api.domain.Task;
import com.api.domain.dto.TaskDTO;
import com.api.mappers.TaskMapper;
import com.api.service.TaskService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(TaskController.BASE_URL)
@CrossOrigin
public class TaskController {
    public static final String BASE_URL = "/api/v1/tasks";
    private final TaskService taskService;
    public final TaskMapper taskMapper ;

    public TaskController(TaskService taskService, TaskMapper taskMapper) {
        this.taskService = taskService;
        this.taskMapper = taskMapper;
    }

    @GetMapping
    List<TaskDTO> getAllTasks() {
        List<TaskDTO>  tasks = new ArrayList<>();
        for (Task task:taskService.findTasks()) {
            tasks.add(taskMapper.toDTO(task));
        }
        return tasks;
    }

    @GetMapping("/{id}")
    public TaskDTO findTaskById(@PathVariable Long id) {
        return taskMapper.toDTO(taskService.findTask(id));
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public TaskDTO saveTask(@RequestBody TaskDTO task) {
        return taskMapper.toDTO(taskService.saveTask(taskMapper.fromDTO(task)));
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteTask(@PathVariable Long id) {
        taskService.deleteTask(id);
    }

}
