package com.api.mappers;

import com.api.domain.Plan;
import com.api.domain.dto.PlanDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PlanDTOToPlanMapper {

    Plan fromDTO(PlanDTO plan);

    PlanDTO toDTO(Plan plan);

}
