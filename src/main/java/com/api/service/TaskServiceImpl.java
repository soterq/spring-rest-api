package com.api.service;

import com.api.domain.Task;
import com.api.domain.dto.TaskDTO;
import com.api.exceptions.ApiRequestException;
import com.api.helpers.DataAndTimeHelper;
import com.api.mappers.TaskDTOToTaskMapper;
import com.api.mappers.TaskToTaskDTOMapper;
import com.api.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class TaskServiceImpl implements TaskService {
    public final TaskRepository taskRepository;

    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public TaskDTO findTask(Long id) {
        Task task = taskRepository.findById(id).orElseThrow(() -> new ApiRequestException("Task with id " + id + " not found"));
        return  TaskToTaskDTOMapper.INSTANCE.toDto(task);
    }

    @Override
    public List<TaskDTO> findTasks() {
        List<Task> all = taskRepository.findAll();
        List<TaskDTO> taskDTOS = new ArrayList<>();
        for (Task task : all) {
            taskDTOS.add(TaskToTaskDTOMapper.INSTANCE.toDto(task));
        }
        return taskDTOS;
    }

    @Override
    public Task saveTask(TaskDTO task) {
        if(task.getTitle().isEmpty() || task.getTitle()==null){
            throw new ApiRequestException("Title should not be null");
        }
        task.setCreationDate(DataAndTimeHelper.getCurrentDataAndTime());

        return taskRepository.save(TaskDTOToTaskMapper.Instance.dtoToRequest(task));
    }

    @Override
    public void deleteTask(Long id) {
            taskRepository.deleteById(id);
    }
}
