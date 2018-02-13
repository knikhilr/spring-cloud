package com.nrk.weatherapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nrk.weatherapp.service.WeatherService;

@RestController
public class HomeController {
	
	@Autowired
	WeatherService weatherService;

	@RequestMapping("/current/weather")
	public String getWeather() {
		return "The current weather is " + weatherService.getWeather();
	}
}
