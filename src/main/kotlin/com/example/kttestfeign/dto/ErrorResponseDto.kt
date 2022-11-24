package com.example.kttestfeign.dto

data class ErrorResponseDto(
    val errorCode: String,
    val message: String?
) : ResponseDto