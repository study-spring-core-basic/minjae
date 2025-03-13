package com.spring.introduction.controller;

import com.spring.introduction.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller // 1. 컨트롤러 객체 생성해서 스프링 컨테이너에 삽입하는 역할을 자동으로 수행하는 어노테이션
public class MemberController {

    private final MemberService memberService;

    @Autowired // 2. 스프링 컨테이너에 있는 MemberService 객체를 가져다 연결해주는 역할
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }
}
