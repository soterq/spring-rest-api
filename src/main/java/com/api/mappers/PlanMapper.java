package com.api.mappers;

import com.api.domain.Plan;
import com.api.domain.dto.PlanDTO;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface PlanMapper {

    Plan fromDTO(PlanDTO plan);

    PlanDTO toDTO(Plan plan);

}
