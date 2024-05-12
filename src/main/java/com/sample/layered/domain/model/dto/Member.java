package com.sample.layered.domain.model.dto;

import com.sample.layered.domain.model.dto.code.MemberLevel;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Member {
    MemberLevel memberLevel;
    String memberId;
    String name;
    int age;

    @Builder
    private Member(MemberLevel memberLevel, String memberId, String name, int age) {
        this.memberLevel = memberLevel;
        this.memberId = memberId;
        this.name = name;
        this.age = age;
    }
}
