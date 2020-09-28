package com.api.demo.service;

import com.api.demo.domain.Task;

import java.util.List;

public interface TaskService {

    Task findAllTasks(Long id);
    List<Task> findAllTasks();
    Task saveTask(Task task);
}
