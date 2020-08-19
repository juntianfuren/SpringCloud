package com.jtfr.controller;
// TestController.java

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/echo")
    public String demo() {
        return "示例返回echo";
    }

    @GetMapping("/home")
    public String home() {
        return "我是首页home";
    }

    @GetMapping("/admin")
    public String admin() {
        return "我是管理员admin";
    }

    @GetMapping("/normal")
    public String normal() {
        return "我是普通用户normal";
    }

}