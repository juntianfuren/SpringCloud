package com.jtfr.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

// 不引入注册中心了，直接通过 url调用
@FeignClient(name = "user-service", url = "http://127.0.0.1:8080")
public interface UserServiceFeignClient {

	@GetMapping("/user/get")
	String get(@RequestParam("id") Integer id);

}