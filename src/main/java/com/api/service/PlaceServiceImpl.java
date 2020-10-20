package com.api.service;

import com.api.domain.Place;
import com.api.domain.dto.PlaceDTO;
import com.api.exceptions.ApiRequestException;
import com.api.mappers.PlaceDtoToPlaceMapper;
import com.api.mappers.PlaceToPlaceDTOMapper;
import com.api.repository.PlaceRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PlaceServiceImpl implements PlaceService {
    private final PlaceRepository placeRepository;

    public PlaceServiceImpl(PlaceRepository placeRepository) {
        this.placeRepository = placeRepository;
    }

    @Override
    public PlaceDTO getPlace(Long id) {
        Place place = placeRepository.findById(id).orElseThrow(() -> new ApiRequestException("Place with id " + id + " not found"));
        return PlaceToPlaceDTOMapper.INSTANCE.toDto(place);
    }

    @Override
    public List<PlaceDTO> getPlaces() {
        List<Place> all = placeRepository.findAll();
        List<PlaceDTO> placeDTOS = new ArrayList<>();
        for (Place place : all) {
            placeDTOS.add(PlaceToPlaceDTOMapper.INSTANCE.toDto(place));
        }
        return placeDTOS;
    }

    @Override
    public Place savePlace(PlaceDTO place) {
        if(place.getName().isEmpty() || place.getName()==null){
            throw new ApiRequestException("Name should not be null");
        }
        return placeRepository.save(PlaceDtoToPlaceMapper.INSTANCE.toDto(place));
    }

}
