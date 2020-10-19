package com.api.service;

import com.api.domain.Plan;

import java.util.List;

public interface PlanService {

    Plan getPlan(Long id);
    List<Plan> getAllPlans();
    Plan savePlan(Plan plan);

}
