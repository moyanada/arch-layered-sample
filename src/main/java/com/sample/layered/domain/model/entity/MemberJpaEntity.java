package com.sample.layered.domain.model.entity;

import com.sample.layered.domain.model.dto.code.MemberLevel;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@Entity
@EntityListeners(
        AuditingEntityListener.class
)
@Table(name = "member")
public class MemberJpaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long seq;
    private String memberId;
    @Enumerated(EnumType.STRING)
    private MemberLevel memberLevel;
    private String name;
    private int age;
    @CreatedDate
    private LocalDateTime createAt;
    @LastModifiedDate
    private LocalDateTime updateAt;

}
