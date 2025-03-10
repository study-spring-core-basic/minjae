package com.spring.introduction.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IntroductionController {

    @GetMapping("introduction") // 정적 컨텐츠
    public String hello(Model model) {
        model.addAttribute("data", "hello!!");
        return "introduction"; // resources 에서 찾아서 반환할 파일의 이름
    }

    @GetMapping("introduction-mvc") // mvc와 템플릿 엔진
    public String helloMvc(@RequestParam(value = "name") String name, Model model) {
        model.addAttribute("name", name);
        return "introduction-template"; // resources 에서 찾아서 반환할 파일의 이름
    }

    @GetMapping("introduction-string") // localhost:8080/ 뒤에 오게될 주소의 이름
    @ResponseBody // ResponseBody 명시
    public String helloString(@RequestParam(value = "name") String name) { // Query 형식으로 넘겨주어야함
        return "this is " + name;
    }

    @GetMapping("introduction-api") // api 방식
    @ResponseBody
    public Hello helloApi(@RequestParam(value = "name") String name) {
        Hello hello = new Hello();
        hello.setName(name);
        return hello; // 객체를 반환하고 있음
    }

    static class Hello {
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
