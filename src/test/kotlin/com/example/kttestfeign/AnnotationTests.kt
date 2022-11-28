package com.example.kttestfeign

import com.example.kttestfeign.delegate.LoggerDelegate
import com.example.kttestfeign.service.FeignService
import io.kotest.core.spec.style.AnnotationSpec
import io.kotest.extensions.spring.SpringExtension
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class AnnotationTests : AnnotationSpec() {

    override fun extensions() = listOf(SpringExtension)

    private val log by LoggerDelegate()

    @Autowired
    private lateinit var feignService: FeignService

    @Test
    fun annotationTest() {

        val result = feignService.testFeignClient("TEST")

        log.warn("result :: {}", result)
    }
}