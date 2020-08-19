package com.jtfr.controller;

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
@RequestMapping("/demo")
public class DemoController {

	@GetMapping("/echo")
	public String echo() {
		return "echo";
	}

	@GetMapping("/hello")
	public String hello() {
		return "hello";
	}

}