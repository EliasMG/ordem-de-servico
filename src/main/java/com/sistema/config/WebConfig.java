package com.sistema.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.sistema.thymeleaf.SistemaDialect;

@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {
	
	@Bean
	public SistemaDialect sistemaDialect() {
		return new SistemaDialect();
	}
}
