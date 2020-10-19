package com.api.bootstrap;

import com.api.domain.Languages;
import com.api.domain.Place;
import com.api.domain.Plan;
import com.api.domain.Task;
import com.api.enums.Severity;
import com.api.repository.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Component
public class BootStrapData implements CommandLineRunner {

    private final CustomerRepository customerRepository;
    private final TaskRepository taskRepository;
    private final PlanRepository planRepository;
    private final PlaceRepository placeRepository;

    public BootStrapData(CustomerRepository customerRepository, TaskRepository taskRepository, PlanRepository planRepository, PlaceRepository placeRepository) {
        this.customerRepository = customerRepository;
        this.taskRepository = taskRepository;
        this.planRepository = planRepository;
        this.placeRepository = placeRepository;
    }

    @Override
    public void run(String... args) {
//        System.out.println("Loading Plan Data");
//        Set<Languages> languages = new HashSet<>();
//        languages.add(Languages.ROMANA);
//        languages.add(Languages.ENGLEZA);
//        languages.add(Languages.RUSA);
//        Plan plan = new Plan();
//        Place place = new Place("Botanic Garden", "Amazing  park a lot of plants", languages, "", "A huge amount of plants");
//        Set<Place> places = new HashSet<>();
//        places.add(place);
//        plan.setTitle("Spring Forum Test ... ");
//        plan.setPlaces(places.stream().collect(Collectors.toList()));
//        planRepository.save(plan);
//        place.setPlan(plan);
//        placeRepository.save(place);

    }
}
