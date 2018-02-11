package com.nrk.gatewayservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.nrk.gatewayservice.filter.HeaderFilter;

@Configuration
public class FilterConfig {
	
	@Bean
	public HeaderFilter addHeaderFilter() {
		return new HeaderFilter();
	}

}
