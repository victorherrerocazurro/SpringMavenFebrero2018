package com.ejemplo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;
import org.springframework.web.servlet.view.freemarker.FreeMarkerViewResolver;

@Configuration
@ComponentScan("com.ejemplo.controller")
@EnableWebMvc
public class ConfiguracionWebMvc implements WebMvcConfigurer {


//	@Bean
//	public FreeMarkerConfigurer freeMarkerConfigurer() {
//		FreeMarkerConfigurer configurer = new FreeMarkerConfigurer();
//		return configurer;
//	}
//
//	@Bean
//	public ViewResolver freeMarkerViewResolver() {
//		FreeMarkerViewResolver resolver = new FreeMarkerViewResolver();
//		resolver.setPrefix("/WEB-INF/views/");
//		resolver.setSuffix(".ftl");
//		return resolver;
//	}

	@Bean
	public ViewResolver internalResourceviewResolver() {
		return new InternalResourceViewResolver("/WEB-INF/views/", ".jsp");
	}
	
}
