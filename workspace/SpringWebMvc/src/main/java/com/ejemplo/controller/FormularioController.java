package com.ejemplo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ejemplo.Persona;

@Controller
@RequestMapping("/formulario")
public class FormularioController {

	@ModelAttribute("persona")
	public Persona initPersona() {
		Persona persona = new Persona();
		return persona;
	}
	
	@GetMapping
	public String obtenerFormulario() {
		return "formulario";
	}

	@PostMapping
	public String procesarFormulario(@ModelAttribute("persona") Persona persona) {
		return "formulario";
	}
	
}
