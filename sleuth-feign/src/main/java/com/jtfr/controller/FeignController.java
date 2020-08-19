package com.jtfr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jtfr.service.UserServiceFeignClient;

@RestController
@RequestMapping("/feign")
public class FeignController {

	@Autowired
	private UserServiceFeignClient userServiceFeignClient;

	@GetMapping("/get")
	public String get(@RequestParam("id") Integer id) {
		return userServiceFeignClient.get(id);
	}

}