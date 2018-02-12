package com.nrk.ribbontimeapp.controller;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class HomeController {	
	
	@Autowired
	RestTemplate restTemplate;
	
	@RequestMapping("/")
	public String getMapping() {
		return restTemplate.getForEntity("http://time-service", String.class).getBody();
		
	}
}
