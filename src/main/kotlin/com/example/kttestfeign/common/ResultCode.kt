package com.example.kttestfeign.common

enum class ResultCode(val message: String) {

    SUCCESS("성공"),
    BAD_REQUEST("요청에 오류가 있습니다."),
    UNAUTHORIZED("인증이 필요한 요청입니다."),
    FORBIDDEN("허용되지 않은 접근입니다."),
    NOT_FOUND("대상이 존재하지 않습니다."),
    INTERNAL_SERVER_ERROR("서버에 오류가 발생했습니다. 잠시 후 다시 시도해주세요."),
    MEMBER_NOT_FOUND("사용자가 존재하지 않습니다."),
    MEMBER_NICKNAME_ALREADY_EXIST("이미 존재하는 닉네임입니다."),
    ORGANIZATION_NOT_FOUND("오거니제이션이 존재하지 않습니다.");
}