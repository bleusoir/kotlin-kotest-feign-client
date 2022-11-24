package com.example.kttestfeign.dto

data class NormalResponseDto(
    val data: Any?,
    val message: String?
) : ResponseDto