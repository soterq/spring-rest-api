package com.api.mappers;

import com.api.domain.Plan;
import com.api.domain.dto.PlanDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {PlaceMapper.class})
public interface PlanMapper {
    PlanMapper INSTANCE = Mappers.getMapper(PlanMapper.class);

//    @Mapping(source = "doctor.patientList", target = "patientDtoList")
//    @Mapping(source = "doctor.specialty", target = "specialization")
    PlanDTO toDto(Plan plan);

}
