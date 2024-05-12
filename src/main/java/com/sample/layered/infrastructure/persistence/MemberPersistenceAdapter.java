package com.sample.layered.infrastructure.persistence;

import com.sample.layered.application.processor.MemberProcessor;
import com.sample.layered.domain.model.dto.Member;
import com.sample.layered.domain.repository.MemberRepository;
import com.sample.layered.infrastructure.persistence.jpa.MemberJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MemberPersistenceAdapter implements MemberRepository {

    private final MemberJpaRepository memberJpaRepository;

    public MemberPersistenceAdapter(MemberJpaRepository memberJpaRepository) {
        this.memberJpaRepository = memberJpaRepository;
    }

    @Override
    public Member getMemberInfo(String memberId) {
        Member member111 = memberJpaRepository.findByMemberId(memberId);
        System.out.println("member111 = " + member111);
        return null;
    }
}
