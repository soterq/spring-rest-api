package com.api.service;

import com.api.domain.Task;
import com.api.exceptions.ApiRequestException;
import com.api.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
@Service
public class TaskServiceImpl implements TaskService {
    public final TaskRepository taskRepository;

    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Task findTask(Long id) {
        return taskRepository.findById(id).orElseThrow(() -> new ApiRequestException("Task with id "  + id +" not found"));
    }

    @Override
    public List<Task> findTasks() {
        return taskRepository.findAll();
    }

    @Override
    public Task saveTask(Task task) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        task.setCreationDate(dtf.format(now));
        return taskRepository.save(task);
    }

    @Override
    public void deleteTask(Long id) {
            taskRepository.deleteById(id);
    }
}
