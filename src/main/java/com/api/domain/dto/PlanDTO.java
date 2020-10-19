package com.api.domain.dto;

import com.api.domain.Place;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class PlanDTO {
    private Long id;
    private String Title;
    private List<Place> places = new ArrayList<>();

}
