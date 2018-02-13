package com.nrk.datetimeapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@EnableCircuitBreaker
public class DatetimeAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(DatetimeAppApplication.class, args);
	}	
	
}
