package com.example.kttestfeign.exception

import com.example.kttestfeign.common.ResultCode

abstract class ServerException(
    val resultCode: ResultCode
) : RuntimeException() {

//    val resultCode: ResultCode
//    fun getResultCode(): ResultCode {
//        return resultCode
//    }

}