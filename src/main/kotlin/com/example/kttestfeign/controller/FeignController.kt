package com.example.kttestfeign.controller

import com.example.kttestfeign.delegate.LoggerDelegate
import com.example.kttestfeign.service.FeignService
import org.springframework.http.HttpStatus.CREATED
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("feign")
class FeignController(
    private val feignService: FeignService
) {

    private val log by LoggerDelegate()

    @GetMapping
    fun test(): ResponseEntity<Any?> {

        log.warn("get feign requested")

        return ResponseEntity
            .status(CREATED)
            .body(feignService.testFeignClient("TEST"))
    }
}