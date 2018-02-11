package com.nrk.goodbyeservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeController {	
	
	@RequestMapping("/")
	public String sayHello() {
		return "Good Bye";
	}
}
