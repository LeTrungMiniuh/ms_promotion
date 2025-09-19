package com.ticketsystem.promotion.service.mapper;

import com.ticketsystem.promotion.domain.ConditionByLocation;
import com.ticketsystem.promotion.domain.Promotion;
import com.ticketsystem.promotion.service.dto.ConditionByLocationDTO;
import com.ticketsystem.promotion.service.dto.PromotionDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link ConditionByLocation} and its DTO {@link ConditionByLocationDTO}.
 */
@Mapper(componentModel = "spring")
public interface ConditionByLocationMapper extends EntityMapper<ConditionByLocationDTO, ConditionByLocation> {
    @Mapping(target = "promotion", source = "promotion", qualifiedByName = "promotionId")
    ConditionByLocationDTO toDto(ConditionByLocation s);

    @Named("promotionId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    PromotionDTO toDtoPromotionId(Promotion promotion);
}
