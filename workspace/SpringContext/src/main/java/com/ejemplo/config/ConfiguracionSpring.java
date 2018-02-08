package com.ejemplo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan("com.ejemplo")
public class ConfiguracionSpring {

	@Bean
	@Scope("Singleton")
	public String victor() {
		return new String("Victor");
	}
	
	@Bean
	@Scope("Prototype")
	@Autowired
	public String juan(@Qualifier("victor") String xxx) {
		//return new String(xxx);
		return new String(victor());
	}
	
}
