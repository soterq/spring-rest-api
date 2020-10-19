package com.api.service;

import com.api.domain.Place;
import com.api.exceptions.ApiRequestException;
import com.api.helpers.DataAndTimeHelper;
import com.api.repository.PlaceRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PlaceServiceImpl implements PlaceService {
    private final PlaceRepository placeRepository;

    public PlaceServiceImpl(PlaceRepository placeRepository) {
        this.placeRepository = placeRepository;
    }

    @Override
    public Place getPlace(Long id) {
        return placeRepository.findById(id).orElseThrow(() -> new ApiRequestException("Place with id " + id + " not found"));
    }

    @Override
    public List<Place> getPlaces() {

        return placeRepository.findAll();
    }

    @Override
    public Place savePlace(Place place) {
        place.setLastVisit(DataAndTimeHelper.getCurrentDataAndTime());
        return placeRepository.save(place);
    }
}
