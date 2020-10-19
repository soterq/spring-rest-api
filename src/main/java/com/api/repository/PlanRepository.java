package com.api.repository;

import com.api.domain.Plan;
import org.springframework.data.jpa.repository.JpaRepository;

    public interface PlanRepository extends JpaRepository<Plan, Long> {
}
