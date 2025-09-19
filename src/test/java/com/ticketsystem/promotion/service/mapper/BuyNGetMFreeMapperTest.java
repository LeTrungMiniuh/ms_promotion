package com.ticketsystem.promotion.service.mapper;

import static com.ticketsystem.promotion.domain.BuyNGetMFreeAsserts.*;
import static com.ticketsystem.promotion.domain.BuyNGetMFreeTestSamples.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BuyNGetMFreeMapperTest {

    private BuyNGetMFreeMapper buyNGetMFreeMapper;

    @BeforeEach
    void setUp() {
        buyNGetMFreeMapper = new BuyNGetMFreeMapperImpl();
    }

    @Test
    void shouldConvertToDtoAndBack() {
        var expected = getBuyNGetMFreeSample1();
        var actual = buyNGetMFreeMapper.toEntity(buyNGetMFreeMapper.toDto(expected));
        assertBuyNGetMFreeAllPropertiesEquals(expected, actual);
    }
}
