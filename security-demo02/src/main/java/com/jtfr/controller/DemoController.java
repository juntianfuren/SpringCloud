package com.jtfr.controller;
// DemoController.java

import javax.annotation.security.PermitAll;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {

	/**
	 * 所有都可以访问，但是这里注解不生效，SecurityConfig」中，配置了 .anyRequest().authenticated()， Java Config 配置的权限，和注解配置的权限，两者是叠加的。
	 */
    @PermitAll
    @GetMapping("/echo")
    public String demo() {
        return "示例返回echo";
    }
    /**
     *  什么都没有，就是登陆就行。
     */
    @GetMapping("/home")
    public String home() {
        return "我是首页home";
    }

    /**
     * admin 角色
     */
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @GetMapping("/admin")
    public String admin() {
        return "我是管理员admin";
    }
    /**
     * NORMAL 角色
     */
    @PreAuthorize("hasRole('ROLE_NORMAL')")
    @GetMapping("/normal")
    public String normal() {
        return "我是普通用户normal";
    }

}