package com.ticketsystem.promotion.repository;

import com.ticketsystem.promotion.domain.BuyNGetMFree;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the BuyNGetMFree entity.
 */
@SuppressWarnings("unused")
@Repository
public interface BuyNGetMFreeRepository extends JpaRepository<BuyNGetMFree, Long>, JpaSpecificationExecutor<BuyNGetMFree> {}
