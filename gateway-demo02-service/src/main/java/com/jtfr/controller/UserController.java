package com.jtfr.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jtfr.entity.User;

@RestController
@RequestMapping("/user")
public class UserController {

	@GetMapping("/get")
	public User get(@RequestParam("id") Integer id) {
		return new User().setId(id).setName("没有昵称：" + id).setGender(id % 2 + 1); // 1 - 男；2 - 女
	}

	@PostMapping("/add")
	public Integer add(User user) {
		return (int) (System.currentTimeMillis() / 1000); // 嘿嘿，随便返回一个 id
	}

}