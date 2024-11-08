package com.kotturi.hello.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@Value("${app.title}")
	private String greeting;
	
	@RequestMapping("/hello")
	public String sayHello() {
		System.out.println("Inside HelloController::sayHello()");
		return greeting;
	}

}
