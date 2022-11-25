package com.example.kttestfeign.exception

import com.example.kttestfeign.common.ResultCode

open class NotFoundException : ServerException(resultCode = ResultCode.NOT_FOUND) {

}