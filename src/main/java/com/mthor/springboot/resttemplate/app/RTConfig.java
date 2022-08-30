package com.mthor.springboot.resttemplate.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RTConfig {
	
	@Bean("userRest")
	public RestTemplate restTemplateConfiguration() {
		return new RestTemplate();
	}

}
