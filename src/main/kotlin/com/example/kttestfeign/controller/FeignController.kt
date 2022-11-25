package com.example.kttestfeign.controller

import com.example.kttestfeign.delegate.LoggerDelegate
import com.example.kttestfeign.service.FeignService
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

        return ResponseEntity
            .status(CREATED)
            .body(feignService.testFeignClient("TEST"))
    }
}