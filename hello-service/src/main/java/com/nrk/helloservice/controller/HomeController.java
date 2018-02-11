package com.nrk.helloservice.controller;

import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeController {	
	
	@RequestMapping("/")
	public String sayHello(@RequestHeader("x-location") String location) {
		return "Hello from " + location;
	}
}
