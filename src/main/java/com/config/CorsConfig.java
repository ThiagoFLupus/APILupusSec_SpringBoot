package com.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

@Configuration
public class CorsConfig {
	
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			
			@Override
			public void addCorsMappings(CorsRegistry reg) {
				reg.addMapping("/**")
					.allowedMethods("GET", "POST", "OPTIONS", "PUT")
					.allowedHeaders("*")
					.allowedOrigins("*");
			}
		};
	}
}
