package com.api.domain.dto;

import com.api.domain.Languages;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Set;

@Getter
@Setter

public class PlaceDTO {
    private Long id;
    private String name;
    private String description;
    private Set<Languages> spokenLanguage;
    private String commodities;
    private String features;
    private LocalDateTime lastVisit;
}
