package com.example.Member.Repository;

import com.example.Member.domain.Member;

public class MemoryRepository implements MemberRepository{
    private static String id;
    private static String name;
    @Override
    public Member save(Member member) {
        member.setId(id);
        member.setName(name);
        return member;
    }
}
