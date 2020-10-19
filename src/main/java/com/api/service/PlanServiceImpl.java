package com.api.service;

import com.api.domain.Place;
import com.api.domain.Plan;
import com.api.exceptions.ApiRequestException;
import com.api.repository.PlanRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PlanServiceImpl implements PlanService {
    public final PlanRepository planRepository;

    public PlanServiceImpl(PlanRepository planRepository) {
        this.planRepository = planRepository;
    }

    @Override
    public Plan getPlan(Long id) {
        return planRepository.findById(id).orElseThrow(() -> new ApiRequestException("Plan with id " + id + " not found"));
    }

    @Override
    public List<Plan> getAllPlans() {
        return planRepository.findAll();
    }

    @Override
    public Plan savePlan(Plan plan) {
        return planRepository.save(plan);
    }
}
