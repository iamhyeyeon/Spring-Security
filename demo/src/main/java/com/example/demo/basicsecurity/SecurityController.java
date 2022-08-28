package com.example.demo.basicsecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {
    @GetMapping("/")
    public String index(){
        return "home"; //html 출력 내용
    }

    @GetMapping("/loginPage")
    public String loginPage(){
        return "로그인 페이지입니다";
    }
}
