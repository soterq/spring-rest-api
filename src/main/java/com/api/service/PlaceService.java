package com.api.service;

import com.api.domain.Place;
import com.api.domain.dto.PlaceDTO;

import java.util.List;

public interface PlaceService {
    PlaceDTO getPlace(Long id);

    List<PlaceDTO> getPlaces();

     Place savePlace(PlaceDTO place);

}
