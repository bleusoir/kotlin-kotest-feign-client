package com.example.kttestfeign

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients

@EnableFeignClients
@SpringBootApplication
class KtTestFeignApplication

fun main(args: Array<String>) {
    runApplication<KtTestFeignApplication>(*args)
}
