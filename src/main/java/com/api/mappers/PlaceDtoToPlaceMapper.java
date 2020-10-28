package com.api.mappers;

import com.api.domain.Place;
import com.api.domain.dto.PlaceDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PlaceDtoToPlaceMapper {
//    PlaceDtoToPlaceMapper INSTANCE = Mappers.getMapper(PlaceDtoToPlaceMapper.class);
//
//    @Mappings({
//            @Mapping(source = "id", target = "id"),
//            @Mapping(source = "name", target = "name"),
//            @Mapping(source = "description", target = "description"),
//            @Mapping(source = "spokenLanguage", target = "spokenLanguage"),
//            @Mapping(source = "commodities", target = "commodities"),
//            @Mapping(source = "features", target = "features"),
//            @Mapping(source = "lastVisit", target = "lastVisit"),
//    })
    Place fromDto(PlaceDTO place);

    PlaceDTO toDto(Place place);
}
