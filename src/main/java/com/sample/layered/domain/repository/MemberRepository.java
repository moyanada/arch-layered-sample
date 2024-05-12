package com.sample.layered.domain.repository;

import com.sample.layered.domain.model.dto.Member;

public interface MemberRepository {
    Member getMemberInfo(String memberId);


}
