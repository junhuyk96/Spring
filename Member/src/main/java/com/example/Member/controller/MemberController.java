package com.example.Member.controller;

import com.example.Member.DTO.MemberForm;
import com.example.Member.Repository.MemberRepository;
import com.example.Member.domain.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MemberController {

    @Autowired
    private MemberRepository memberRepository;

    @PostMapping("/input")
    public String create(MemberForm form) {
        System.out.println(form.toString());
        return "input.html";
    }
}
