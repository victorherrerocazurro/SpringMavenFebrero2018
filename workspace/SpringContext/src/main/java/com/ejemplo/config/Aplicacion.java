package com.ejemplo.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ejemplo.Cliente;
import com.ejemplo.Controlador;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConfiguracionSpring.class);
		
		/*Cliente clienteVictor = applicationContext.getBean("clienteVictor", Cliente.class);
		
		System.out.println(clienteVictor.getNombre());*/
		
		Controlador controlador = applicationContext.getBean(Controlador.class);
		
		controlador.exponerPorHttpUnRequisito();
	}

}
