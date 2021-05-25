package com.api.service;

import com.api.domain.Place;
import com.api.exceptions.ApiRequestException;
import com.api.mappers.PlaceMapper;
import com.api.repository.PlaceRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlaceServiceImpl implements PlaceService {
    private final PlaceRepository placeRepository;
    private final PlaceMapper placeMapper;

    public PlaceServiceImpl(PlaceRepository placeRepository, PlaceMapper placeMapper) {
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
