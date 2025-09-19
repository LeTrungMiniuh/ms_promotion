package com.ticketsystem.promotion.repository;

import com.ticketsystem.promotion.domain.ConditionByLocation;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the ConditionByLocation entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ConditionByLocationRepository
    extends JpaRepository<ConditionByLocation, Long>, JpaSpecificationExecutor<ConditionByLocation> {}
