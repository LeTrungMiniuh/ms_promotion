package com.ticketsystem.promotion.service.mapper;

import com.ticketsystem.promotion.domain.BuyNGetMFree;
import com.ticketsystem.promotion.domain.Promotion;
import com.ticketsystem.promotion.service.dto.BuyNGetMFreeDTO;
import com.ticketsystem.promotion.service.dto.PromotionDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link BuyNGetMFree} and its DTO {@link BuyNGetMFreeDTO}.
 */
@Mapper(componentModel = "spring")
public interface BuyNGetMFreeMapper extends EntityMapper<BuyNGetMFreeDTO, BuyNGetMFree> {
    @Mapping(target = "promotion", source = "promotion", qualifiedByName = "promotionId")
    BuyNGetMFreeDTO toDto(BuyNGetMFree s);

    @Named("promotionId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    PromotionDTO toDtoPromotionId(Promotion promotion);
}
