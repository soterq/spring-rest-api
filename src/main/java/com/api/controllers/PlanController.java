package com.api.controllers;

import com.api.domain.Plan;
import com.api.domain.dto.PlanDTO;
import com.api.mappers.PlanDTOToPlanMapper;
import com.api.service.PlanService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RequestMapping(PlanController.BASE_URL)
@RestController
public class PlanController {
    public static final String BASE_URL = "/api/v1/plans";
    public final PlanService planService;
    public final PlanDTOToPlanMapper planMapper;

    public PlanController(PlanService planService, PlanDTOToPlanMapper planMapper) {
        this.planService = planService;
        this.planMapper = planMapper;
    }

    @GetMapping
    public List<PlanDTO> getAllPlans() {
        List<PlanDTO> plans = new ArrayList<>();
        for (Plan plan : planService.getAllPlans()) {
            plans.add(planMapper.toDTO(plan));
        }
        return plans;
    }

    @GetMapping("/{id}")
    public PlanDTO getPlanById(@PathVariable Long id) {
        return planMapper.toDTO(planService.getPlan(id));
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public PlanDTO createPlan(@RequestBody PlanDTO plan) {
        return planMapper.toDTO(planService.savePlan(planMapper.fromDTO(plan)));

    }

}
