package com.example.kttestfeign.error

import com.example.kttestfeign.exception.TestFeignNotFoundException
import feign.Response
import feign.codec.ErrorDecoder

class TestFeignError : ErrorDecoder {

    override fun decode(methodKey: String?, response: Response?): Exception? {
        if (response != null) {
            when (response.status()) {
                404 -> return TestFeignNotFoundException()
            }
        }

        return null
    }
}