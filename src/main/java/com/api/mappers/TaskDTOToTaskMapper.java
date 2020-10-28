package com.api.mappers;

import com.api.domain.Task;
import com.api.domain.dto.TaskDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TaskDTOToTaskMapper {

    TaskDTO toDTO(Task taskDTO);
    Task fromDTO(TaskDTO taskDTO);
}
