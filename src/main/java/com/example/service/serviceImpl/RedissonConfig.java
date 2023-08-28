//package com.example.service.serviceImpl;
//
//import org.redisson.config.Config;
//import org.redisson.Redisson;
//import org.redisson.api.RedissonClient;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class RedissonConfig {
//
//    private final static String REDIS_HOST = "localhost";
//    private final static int REDIS_PORT = 6379;
//
//    @Bean
//    public RedissonClient redissonClient() {
//        Config config = new Config();
//        config.useSingleServer().setAddress("redis://" + REDIS_HOST + ":" + REDIS_PORT);
//        return Redisson.create(config);
//    }
//}
