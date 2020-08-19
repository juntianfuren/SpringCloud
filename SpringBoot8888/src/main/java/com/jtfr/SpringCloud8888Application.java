package com.jtfr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringCloud8888Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloud8888Application.class, args);
	}

	@GetMapping("/test")
	public String test() {
		return "com.jtfr.Application";
	}
	
	@GetMapping()
	public String test2() {
		return "com.jtfr.Application+test2";
	}
}
