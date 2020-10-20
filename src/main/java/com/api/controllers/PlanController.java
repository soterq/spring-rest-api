package com.api.controllers;

import com.api.domain.Plan;
import com.api.domain.dto.PlanDTO;
import com.api.service.PlanService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(PlanController.BASE_URL)
@RestController
public class PlanController {
    public static final String BASE_URL = "/api/v1/plans";
    public final PlanService planService;

    public PlanController(PlanService planService) {
        this.planService = planService;
    }

    @GetMapping
    public List<PlanDTO> getAllPlans() {
        return planService.getAllPlans();
    }

    @GetMapping("/{id}")
    public PlanDTO getPlanById(@PathVariable Long id) {
        return planService.getPlan(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Plan createPlan(@RequestBody PlanDTO plan) {
        return planService.savePlan(plan);
    }

}
