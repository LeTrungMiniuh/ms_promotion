package com.ticketsystem.promotion.service.mapper;

import com.ticketsystem.promotion.domain.PercentOffTotal;
import com.ticketsystem.promotion.domain.Promotion;
import com.ticketsystem.promotion.service.dto.PercentOffTotalDTO;
import com.ticketsystem.promotion.service.dto.PromotionDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link PercentOffTotal} and its DTO {@link PercentOffTotalDTO}.
 */
@Mapper(componentModel = "spring")
public interface PercentOffTotalMapper extends EntityMapper<PercentOffTotalDTO, PercentOffTotal> {
    @Mapping(target = "promotion", source = "promotion", qualifiedByName = "promotionId")
    PercentOffTotalDTO toDto(PercentOffTotal s);

    @Named("promotionId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    PromotionDTO toDtoPromotionId(Promotion promotion);
}
