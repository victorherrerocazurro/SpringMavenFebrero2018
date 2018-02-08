package com.ejemplo.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@RequestMapping("/holamundo")
@SessionAttributes("nombre")
public class HolaMundoController {

	@RequestMapping(path="/saludo/{nombre}",method=RequestMethod.GET)
	public String saludar(Map<String, Object> model, 
			@PathVariable String nombre, 
			@RequestParam String apellido) {
		
		System.out.println("En el controlador");
		
		String saludo = nombre + " " + apellido;
		
		model.put("nombre", saludo);
		
		model.put("mensaje", "Hola " + saludo );
		
		return "holamundo";
	}
	
	@RequestMapping(path="/despedir",method=RequestMethod.GET)
	public String despedir(Map<String, Object> model, 
			@SessionAttribute("nombre") String nombre) {
		
		System.out.println("En el controlador");
		model.put("mensaje", "Adios " + nombre );
		
		return "holamundo";
	}

}
