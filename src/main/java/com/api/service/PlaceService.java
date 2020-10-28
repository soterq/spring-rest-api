package com.api.service;

import com.api.domain.Place;
import com.api.domain.dto.PlaceDTO;

import java.util.List;

public interface PlaceService {
    Place getPlace(Long id);

    List<Place> getPlaces();

    Place savePlace(Place place);

}
