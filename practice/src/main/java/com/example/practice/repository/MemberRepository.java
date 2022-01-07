package com.example.practice.repository;

import com.example.practice.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {

    Member save(Member member);
    Optional<Member> findId(Long id);
    Optional<Member> findName(String name);
    Optional<Member> findEmail(String email);
    Optional<Member> findPhone(String phone);
    List<Member> findAll();
}
