package com.sample.layered.presentation.response;

import com.sample.layered.domain.model.dto.code.MemberLevel;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

@Getter
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class MemberInfoResponse {

    String memberId;
    MemberLevel memberLevel;
    String name;
    int age;

}
