package com.sample.layered.domain.model.dto.code;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

@Getter
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
@RequiredArgsConstructor
public enum MemberLevel {

    USER("USER", "일반사용자"),
    ADMIN("ADMIN", "관리자")
    ;

    String code;
    String codeName;

}
