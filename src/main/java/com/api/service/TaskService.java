package com.api.service;

import com.api.domain.Task;

import java.util.List;

public interface TaskService {

    Task findTask(Long id);
    List<Task> findTask();
    Task saveTask(Task task);

    void deleteTask(Long id);
}
