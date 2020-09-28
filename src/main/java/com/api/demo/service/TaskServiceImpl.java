package com.api.demo.service;

import com.api.demo.domain.Task;
import com.api.demo.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TaskServiceImpl implements TaskService {
    public final TaskRepository taskRepository;

    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Task findTask(Long id) {

        return taskRepository.findById(id).orElseThrow(() -> new RuntimeException("Task not found"));
    }

    @Override
    public List<Task> findTask() {
        return taskRepository.findAll();
    }

    @Override
    public Task saveTask(Task task) {
        return taskRepository.save(task);
    }

    @Override
    public void deleteTask(Long id) {
            taskRepository.deleteById(id);
    }
}
