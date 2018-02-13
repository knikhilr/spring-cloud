package com.nrk.datetimeservice.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/datetime")
	public String getCurrentDatetime() {
		return new Date().toString();
	}
}
