package com.ticketsystem.promotion.service.mapper;

import static com.ticketsystem.promotion.domain.PercentOffTotalAsserts.*;
import static com.ticketsystem.promotion.domain.PercentOffTotalTestSamples.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PercentOffTotalMapperTest {

    private PercentOffTotalMapper percentOffTotalMapper;

    @BeforeEach
    void setUp() {
        percentOffTotalMapper = new PercentOffTotalMapperImpl();
    }

    @Test
    void shouldConvertToDtoAndBack() {
        var expected = getPercentOffTotalSample1();
        var actual = percentOffTotalMapper.toEntity(percentOffTotalMapper.toDto(expected));
        assertPercentOffTotalAllPropertiesEquals(expected, actual);
    }
}
