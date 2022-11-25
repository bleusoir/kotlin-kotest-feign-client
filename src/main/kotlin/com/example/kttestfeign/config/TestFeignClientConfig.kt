package com.example.kttestfeign.config

import com.example.kttestfeign.error.TestFeignError
import feign.Logger
import feign.codec.ErrorDecoder
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class TestFeignClientConfig {

    @Bean
    fun testFeignClientLoggerLevel(): Logger.Level {
        return Logger.Level.FULL
    }

    @Bean
    fun errorDecode(): ErrorDecoder {
        return TestFeignError()
    }

}