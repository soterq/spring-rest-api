package com.api.mappers;

import com.api.domain.Plan;
import com.api.domain.dto.PlanDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PlanDTOToPlanMapper {
    PlanDTOToPlanMapper INSTANCE = Mappers.getMapper(PlanDTOToPlanMapper.class);

    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "title", target = "title"),
            @Mapping(source = "places", target = "places"),
    })
    Plan toDto(PlanDTO plan);
}
