package com.api.mappers;

import com.api.domain.Place;
import com.api.domain.dto.PlaceDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PlaceToPlaceDTOMapper {
    PlaceToPlaceDTOMapper INSTANCE = Mappers.getMapper(PlaceToPlaceDTOMapper.class);

    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "name", target = "name"),
            @Mapping(source = "description", target = "description"),
            @Mapping(source = "spokenLanguage", target = "spokenLanguage"),
            @Mapping(source = "commodities", target = "commodities"),
            @Mapping(source = "features", target = "features"),
            @Mapping(source = "lastVisit", target = "lastVisit"),
    })
    PlaceDTO toDto(Place place);
}
