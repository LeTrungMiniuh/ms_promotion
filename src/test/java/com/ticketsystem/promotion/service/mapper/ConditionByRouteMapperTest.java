package com.ticketsystem.promotion.service.mapper;

import static com.ticketsystem.promotion.domain.ConditionByRouteAsserts.*;
import static com.ticketsystem.promotion.domain.ConditionByRouteTestSamples.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConditionByRouteMapperTest {

    private ConditionByRouteMapper conditionByRouteMapper;

    @BeforeEach
    void setUp() {
        conditionByRouteMapper = new ConditionByRouteMapperImpl();
    }

    @Test
    void shouldConvertToDtoAndBack() {
        var expected = getConditionByRouteSample1();
        var actual = conditionByRouteMapper.toEntity(conditionByRouteMapper.toDto(expected));
        assertConditionByRouteAllPropertiesEquals(expected, actual);
    }
}
