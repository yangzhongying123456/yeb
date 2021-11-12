package com.lzj.serve.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

/**
 * @date:2021/9/11 15:45
 * @author:yang
 */
@Configuration
public class RedisConfig {

    @Bean
    public RedisTemplate<String, Object> redisTemplate(RedisConnectionFactory redisConnectionFactory) {
        RedisTemplate<String, Object> template = new RedisTemplate<>();
        // 设置String类型key序列器
        template.setKeySerializer(new StringRedisSerializer());
        // 设置String类型value序列器
        template.setValueSerializer(new GenericJackson2JsonRedisSerializer());
        // 设置Hash类型key序列器
        template.setHashKeySerializer(new StringRedisSerializer());
        // 设置Hash类型value序列器
        template.setHashValueSerializer(new GenericJackson2JsonRedisSerializer());
        template.setConnectionFactory(redisConnectionFactory);
        return template;
    }
}
