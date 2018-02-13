package com.nrk.weatherservice.controller;

import java.util.concurrent.ThreadLocalRandom;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	private String[] weather = new String[] { "sunny", "cloudy", "rainy", "windy" };
	
	@RequestMapping("/weather")
	public String getTime() {
		int rand = ThreadLocalRandom.current().nextInt(0, 4);
		return weather[rand];
	}
}
