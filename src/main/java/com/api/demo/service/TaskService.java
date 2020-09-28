package com.api.demo.service;

import com.api.demo.domain.Task;

import java.util.List;

public interface TaskService {

    Task findTask(Long id);
    List<Task> findTask();
    Task saveTask(Task task);

    void deleteTask(Long id);
}
