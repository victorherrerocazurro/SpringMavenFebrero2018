package com.ejemplo.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class ConfiguracionWeb implements WebApplicationInitializer{

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		AnnotationConfigWebApplicationContext webApplicationContext = new AnnotationConfigWebApplicationContext();
		webApplicationContext.setConfigLocation(this.getClass().getPackage().getName());
		
		Dynamic servlet = servletContext.addServlet("DispatcherServlet", new DispatcherServlet(webApplicationContext));
		servlet.setLoadOnStartup(1);
		servlet.addMapping("/");
		
	}

}
