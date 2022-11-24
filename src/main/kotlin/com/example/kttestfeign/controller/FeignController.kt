package com.example.kttestfeign.controller

import com.example.kttestfeign.delegate.LoggerDelegate
import com.example.kttestfeign.dto.NormalResponseDto
import com.example.kttestfeign.service.FeignService
import org.springframework.http.HttpStatus
import org.springframework.http.HttpStatus.CREATED
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class FeignController(
    private val feignService: FeignService
) {

    private val log by LoggerDelegate()

    @GetMapping("/test")
    fun test(): ResponseEntity<Any?> {

        log.warn("TEST CONTROLLER")

        feignService.testFeignClient("TEST")

        return ResponseEntity
            .status(CREATED)
            .body(NormalResponseDto("SUCCESS", ""))
    }
}