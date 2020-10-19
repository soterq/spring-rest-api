package com.api.repository;

import com.api.domain.ExistingPlace;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExistingPlaceRepository extends JpaRepository<ExistingPlace, Long> {
}
