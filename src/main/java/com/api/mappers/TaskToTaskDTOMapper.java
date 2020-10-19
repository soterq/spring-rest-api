package com.api.mappers;

import com.api.domain.Task;
import com.api.domain.dto.TaskDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface TaskToTaskDTOMapper {
    TaskToTaskDTOMapper INSTANCE = Mappers.getMapper(TaskToTaskDTOMapper.class);
    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "title", target = "title"),
            @Mapping(source = "description", target = "description"),
            @Mapping(source = "creationDate", target = "creationDate"),
            @Mapping(source = "severity", target = "severity"),
    })
    TaskDTO toDto(Task task);
}
