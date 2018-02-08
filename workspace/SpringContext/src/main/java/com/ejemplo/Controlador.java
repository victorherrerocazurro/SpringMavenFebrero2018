package com.ejemplo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class Controlador {

	@Autowired
	private IServicio servicio;
	
	public void exponerPorHttpUnRequisito() {
		servicio.ejecutarRequisito();
	}
	
}
