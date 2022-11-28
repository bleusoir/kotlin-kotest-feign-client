package com.example.kttestfeign

import com.example.kttestfeign.delegate.LoggerDelegate
import com.example.kttestfeign.dto.NormalResponseDto
import com.example.kttestfeign.service.FeignService
import io.kotest.core.spec.style.DescribeSpec
import io.kotest.extensions.spring.SpringExtension
import io.kotest.matchers.shouldBe
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
internal class DescribeTests : DescribeSpec() {

    override fun extensions() = listOf(SpringExtension)

    private val log by LoggerDelegate()

    @Autowired
    private lateinit var feignService: FeignService

    init {
        this.describe("FEIGN CLIENT TEST") {
            context("CASE") {
                it("RETURN") {

                    val result = feignService.testFeignClient("TEST")

                    log.warn("result is :: {}", result)

                    result shouldBe NormalResponseDto(null, null, "218.48.79.110",
                        "https://httpbin.org/get")
                }
            }
        }
    }
}