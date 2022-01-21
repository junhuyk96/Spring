package com.example.Member.controller;

import com.example.Member.domain.Member;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {
    @GetMapping("input")
    public String input_name(@RequestParam("name") String name,
        @RequestParam("id") String id) {
        Member member = new Member();

        member.setId(id);
        member.setName(name);

        return "ID : " + member.getId() + " NAME : " + member.getName();
    }
}
