package com.api.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@Entity
@EqualsAndHashCode
public class Plan {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    @OneToMany(mappedBy = "plan")
    @EqualsAndHashCode.Exclude
    private List<Place> places = new ArrayList<>();

    public Plan() {
    }

    public Plan(String title, List<Place> places) {
        this.title = title;
        this.places = places;
    }
}
