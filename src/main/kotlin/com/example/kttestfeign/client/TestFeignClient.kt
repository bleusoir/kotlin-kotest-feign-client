package com.example.kttestfeign.client

import com.example.kttestfeign.config.TestFeignClientConfig
import com.example.kttestfeign.dto.NormalResponseDto
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping

@FeignClient(
    name = "testFeignClient",
    url = "https://httpbin.org",
    configuration = [TestFeignClientConfig::class]
)
interface TestFeignClient {

    @GetMapping("/get")
    fun getTest(): NormalResponseDto

    @PostMapping("/post")
    fun createTest(): NormalResponseDto
}