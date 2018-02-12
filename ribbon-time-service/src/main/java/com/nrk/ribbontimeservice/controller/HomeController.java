package com.nrk.ribbontimeservice.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@Value("${server.port}")
	private int port;
	
	@RequestMapping("/")
	public String getTime() {
		return "The current time is " + new Date().toString() +
				"answered by service running on " + port + ")";
	}

}
