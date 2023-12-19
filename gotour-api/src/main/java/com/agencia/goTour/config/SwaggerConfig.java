package com.agencia.goTour.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

	@Bean
	ModelMapper modelMapper() {
		return new ModelMapper();
	}
}