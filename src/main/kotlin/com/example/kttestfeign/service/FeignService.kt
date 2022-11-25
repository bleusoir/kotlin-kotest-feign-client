package com.example.kttestfeign.service

import com.example.kttestfeign.client.TestFeignClient
import com.example.kttestfeign.delegate.LoggerDelegate
import com.example.kttestfeign.dto.NormalResponseDto
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.stereotype.Service

@Service
class FeignService(private val testFeignClient: TestFeignClient) {

    private val log by LoggerDelegate()

    fun testFeignClient(param: String): NormalResponseDto {

        val normalResponseDto = testFeignClient.getTest()

        log.warn("parameter is :: {}", param)
        log.warn("response dto :: {}", normalResponseDto)

        return normalResponseDto
    }
}