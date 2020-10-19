package com.api.service;

import com.api.domain.Task;
import com.api.domain.dto.TaskDTO;

import java.util.List;

public interface TaskService {

    TaskDTO findTask(Long id);
    List<TaskDTO> findTasks();
    Task saveTask(TaskDTO task);

    void deleteTask(Long id);
}
