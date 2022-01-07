package com.example.practice.repository;

import com.example.practice.domain.Member;

import java.util.List;
import java.util.Optional;

public class MemoryMemberRepository implements MemberRepository{

    private Member member = new Member();

    @Override
    public Member save(Member member) {
        return member;
    }

    @Override
    public Optional<Member> findId(Long id) {
        return Optional.ofNullable();
    }

    @Override
    public Optional<Member> findName(String name) {
        return Optional.empty();
    }

    @Override
    public Optional<Member> findEmail(String email) {
        return Optional.empty();
    }

    @Override
    public Optional<Member> findPhone(String phone) {
        return Optional.empty();
    }

    @Override
    public List<Member> findAll() {
        return null;
    }
}


