package com.api.service;

import com.api.domain.Place;
import com.api.domain.dto.PlaceDTO;
import com.api.exceptions.ApiRequestException;
import com.api.mappers.PlaceDtoToPlaceMapper;
import com.api.repository.PlaceRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PlaceServiceImpl implements PlaceService {
    private final PlaceRepository placeRepository;
    private final PlaceDtoToPlaceMapper placeMapper;

    public PlaceServiceImpl(PlaceRepository placeRepository, PlaceDtoToPlaceMapper placeMapper) {
        this.placeRepository = placeRepository;
        this.placeMapper = placeMapper;
    }

    @Override
    public Place getPlace(Long id) {
        return placeRepository.findById(id).orElseThrow(() -> new ApiRequestException("Plan with id " + id + " not found"));
    }

    @Override
    public List<Place> getPlaces() {
        return placeRepository.findAll();
    }

    @Override
    public Place savePlace(Place place) {
        if (place.getName().isEmpty() || place.getName() == null) {
            throw new ApiRequestException("Name should not be null");
        }
        return placeRepository.save(place);
    }

}
