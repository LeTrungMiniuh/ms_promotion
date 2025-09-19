package com.ticketsystem.promotion.repository;

import com.ticketsystem.promotion.domain.ConditionByDate;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the ConditionByDate entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ConditionByDateRepository extends JpaRepository<ConditionByDate, Long>, JpaSpecificationExecutor<ConditionByDate> {}
