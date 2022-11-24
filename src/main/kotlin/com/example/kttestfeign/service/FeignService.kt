package com.example.kttestfeign.service

import com.example.kttestfeign.delegate.LoggerDelegate
import org.springframework.stereotype.Service

@Service
class FeignService {

    private val log by LoggerDelegate()

    fun testFeignClient(param: String): String {
        log.warn("parameter is :: {}", param)

        return param
    }
}