package com.sample.layered.domain.model.dto.code;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.HttpStatus;

@Getter
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
@RequiredArgsConstructor
public enum CommonApiResultCode {

    SUCCESS("S001", "성공", HttpStatus.OK),
    NOT_FOUND_DATA("N001", "조회할 데이터가 없습니다.", HttpStatus.OK),
    FAIL_SYSTEM_ERROR("E001", "시스템 처리 오류 입니다. (관리자에게 문의해주세요)", HttpStatus.OK),
    FAIL_INVALID_PARAMETERS("E002", "유효하지 않은 파라미터입니다.", HttpStatus.OK)
    ;

    String code;
    String message;
    HttpStatus httpStatus;

}
