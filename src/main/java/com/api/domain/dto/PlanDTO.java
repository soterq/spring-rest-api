package com.api.domain.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class PlanDTO {
    private Long id;
    private String title;
    private List<PlaceDTO> places = new ArrayList<>();

}
