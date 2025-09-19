package com.ticketsystem.promotion.service.mapper;

import com.ticketsystem.promotion.domain.ConditionByRoute;
import com.ticketsystem.promotion.domain.Promotion;
import com.ticketsystem.promotion.service.dto.ConditionByRouteDTO;
import com.ticketsystem.promotion.service.dto.PromotionDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link ConditionByRoute} and its DTO {@link ConditionByRouteDTO}.
 */
@Mapper(componentModel = "spring")
public interface ConditionByRouteMapper extends EntityMapper<ConditionByRouteDTO, ConditionByRoute> {
    @Mapping(target = "promotion", source = "promotion", qualifiedByName = "promotionId")
    ConditionByRouteDTO toDto(ConditionByRoute s);

    @Named("promotionId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    PromotionDTO toDtoPromotionId(Promotion promotion);
}
