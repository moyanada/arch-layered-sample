package com.sample.layered.infrastructure.persistence.jpa;

import com.sample.layered.domain.model.dto.Member;
import com.sample.layered.domain.model.entity.MemberJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberJpaRepository extends JpaRepository<MemberJpaEntity, Long> {
    Member findByMemberId(String memberId);
}
