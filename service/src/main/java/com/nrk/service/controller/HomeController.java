package com.nrk.service.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@Value("${eureka.instance.instance-id}")
	private String instance;
	
	@RequestMapping("/")
	public String sayHello() {
		return "Hello from" + instance;
	}
}
