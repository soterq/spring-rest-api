package com.api.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Setter
@Getter
@Entity
@EqualsAndHashCode
public class Place {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotBlank
    private String name;
    private String description;
    @ElementCollection(targetClass = Languages.class, fetch = FetchType.EAGER)
    @Enumerated(EnumType.STRING)
    private Set<Languages> spokenLanguage;
    private String commodities;
    private String features;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime lastVisit;
    @ManyToOne
    @JoinColumn(name = "plan_id",referencedColumnName = "id")
    @EqualsAndHashCode.Exclude private Plan plan;

    public Place() {
    }

    public Place(String name, String description, Set<Languages> spokenLanguage, String commodities, String features) {
        this.name = name;
        this.description = description;
        this.spokenLanguage = spokenLanguage;
        this.commodities = commodities;
        this.features = features;

    }


}
