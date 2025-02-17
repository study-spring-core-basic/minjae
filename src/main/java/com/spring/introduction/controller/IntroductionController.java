package com.spring.introduction.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IntroductionController {

    @GetMapping("introduction")
    public String hello(Model model) {
        model.addAttribute("data", "hello!!");
        return "introduction";
    }
}
