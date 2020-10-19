package com.api.controllers;

import com.api.domain.Plan;
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
    public List<Plan> getAllPlans() {
        return planService.getAllPlans();
    }

    @GetMapping("/{id}")
    public Plan getPlanById(@PathVariable Long id) {
        return planService.getPlan(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Plan createPlan(@RequestBody Plan plan) {
        return planService.savePlan(plan);
    }

}
