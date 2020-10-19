package com.api.mappers;

import com.api.domain.Place;
import com.api.domain.dto.PlaceDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PlaceMapper {
    PlaceMapper INSTANCE = Mappers.getMapper(PlaceMapper.class);
    PlaceDTO toDto(Place place);
}
