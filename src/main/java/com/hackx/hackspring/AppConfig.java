package com.hackx.hackspring;

import com.hackx.hackspring.common.cache.Cachable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * Created by hackx on 8/14/16.
 */
@Configuration
public class AppConfig {

    @Bean
    public RedisConnectionFactory connectionFactory() {
        return new JedisConnectionFactory();
    }

    @Bean
    public RedisTemplate<String, Cachable> redisTemplate() {

        RedisTemplate<String, Cachable> template = new RedisTemplate<String, Cachable>();
        template.setConnectionFactory(connectionFactory());
        return template;
    }
}