package com.spring.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.spring.data.exporter.SalaryJsonConverter;

@Configuration
@ComponentScan (basePackages = {
		"com.spring.dto",
		"com.spring.application",
		"com.spring.data.exporter",
		"com.spring.model.dao.impl",
		"com.spring.model.service.impl"
})
public class AppConfig {

	@Bean
	public SalaryJsonConverter createSalaryJsonConverter() {
		
		return new SalaryJsonConverter();
	}
	
}
