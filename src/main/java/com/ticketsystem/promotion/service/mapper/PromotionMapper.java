package com.ticketsystem.promotion.service.mapper;

import com.ticketsystem.promotion.domain.Promotion;
import com.ticketsystem.promotion.service.dto.PromotionDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Promotion} and its DTO {@link PromotionDTO}.
 */
@Mapper(componentModel = "spring")
public interface PromotionMapper extends EntityMapper<PromotionDTO, Promotion> {}
