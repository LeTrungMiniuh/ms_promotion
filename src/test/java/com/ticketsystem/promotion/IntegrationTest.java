package com.ticketsystem.promotion;

import com.ticketsystem.promotion.config.AsyncSyncConfiguration;
import com.ticketsystem.promotion.config.EmbeddedKafka;
import com.ticketsystem.promotion.config.EmbeddedRedis;
import com.ticketsystem.promotion.config.EmbeddedSQL;
import com.ticketsystem.promotion.config.JacksonConfiguration;
import com.ticketsystem.promotion.config.TestSecurityConfiguration;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(
    classes = { MsPromotionApp.class, JacksonConfiguration.class, AsyncSyncConfiguration.class, TestSecurityConfiguration.class }
)
@EmbeddedRedis
@EmbeddedSQL
@EmbeddedKafka
public @interface IntegrationTest {
}
