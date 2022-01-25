package com.example.Member.controller;

import com.example.Member.Repository.MemberRepository;
import com.example.Member.domain.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {

    @Autowired
    private MemberRepository memberRepository;

    @GetMapping("input")
    public String input_name(@RequestParam("name") String name,
        @RequestParam("ID") String ID) {
        Member member = new Member();

        member.setID(ID);
        member.setName(name);

        memberRepository.save(member);

        return "ID : " + member.getID() + " NAME : " + member.getName();
    }
}
