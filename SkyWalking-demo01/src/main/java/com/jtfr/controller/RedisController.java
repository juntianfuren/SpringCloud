package com.jtfr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * SkyWalking 做到对代码无侵入，只是在代码启动的时候，引入SkyWalking DemoController
 * 
 * @author 陈康明
 * @since 2020年08月03日 17:50
 */
@RestController
@RequestMapping("/redis")
public class RedisController {
	
	@Autowired
	private StringRedisTemplate redisTemplate;

	@GetMapping("/redis")
	public String redis() {
		this.get("demo");
		return "redis";
	}

	public void get(String key) {
		redisTemplate.opsForValue().get(key);
	}

}