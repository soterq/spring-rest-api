package com.api.service;

import com.api.domain.Plan;
import com.api.domain.dto.PlanDTO;

import java.util.List;

public interface PlanService {

    PlanDTO getPlan(Long id);
    List<PlanDTO> getAllPlans();
    Plan savePlan(PlanDTO plan);

}
