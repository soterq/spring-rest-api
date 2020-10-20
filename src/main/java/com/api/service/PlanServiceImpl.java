package com.api.service;

import com.api.domain.Place;
import com.api.domain.Plan;
import com.api.domain.dto.PlaceDTO;
import com.api.domain.dto.PlanDTO;
import com.api.exceptions.ApiRequestException;
import com.api.mappers.PlanDTOToPlanMapper;
import com.api.mappers.PlanToPlanDTOMapper;
import com.api.repository.PlanRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PlanServiceImpl implements PlanService {
    public final PlanRepository planRepository;

    public PlanServiceImpl(PlanRepository planRepository) {
        this.planRepository = planRepository;
    }

    @Override
    public PlanDTO getPlan(Long id) {
        Plan plan = planRepository.findById(id).orElseThrow(() -> new ApiRequestException("Plan with id " + id + " not found"));
        return PlanToPlanDTOMapper.INSTANCE.toDto(plan);
    }

    @Override
    public List<PlanDTO> getAllPlans() {
        List<Plan> all = planRepository.findAll();
        List<PlanDTO> plans = new ArrayList<>();
        for (Plan plan : all) {
            plans.add(PlanToPlanDTOMapper.INSTANCE.toDto(plan));
        }
        return plans;
    }

    @Override
    public Plan savePlan(PlanDTO plan) {
        return planRepository.save(PlanDTOToPlanMapper.INSTANCE.toDto(plan));
    }
}
