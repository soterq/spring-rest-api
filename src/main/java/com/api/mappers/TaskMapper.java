package com.api.mappers;

import com.api.domain.Task;
import com.api.domain.dto.TaskDTO;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface TaskMapper {

    TaskDTO toDTO(Task taskDTO);
    Task fromDTO(TaskDTO taskDTO);
}
