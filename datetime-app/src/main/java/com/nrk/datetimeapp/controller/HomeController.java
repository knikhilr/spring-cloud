package com.nrk.datetimeapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nrk.datetimeapp.service.DatetimeService;

@RestController
public class HomeController {

	@Autowired
	private DatetimeService datetimeService;
	
	@GetMapping("/current/datetime")
	public String getCurrentDateTime() {
		return String.format("The date/time is %s", datetimeService.getCurrentDatetime());
	}
}
