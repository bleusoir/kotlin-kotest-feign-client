package com.example.kttestfeign.dto

data class NormalResponseDto(
    val data: Any?,
    val message: String?,
    val origin: String?,
    val url: String?
) : ResponseDto