package com.ejemplo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ejemplo.Persona;
import com.ejemplo.PersonaValidator;

@Controller
@RequestMapping("/formulario")
public class FormularioController {

	@Autowired
	private PersonaValidator personaValidator;
	
	@InitBinder
	protected void initBinder(final WebDataBinder binder) {
		binder.addValidators(personaValidator);
	}

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
	public String procesarFormulario(@Valid @ModelAttribute("persona") Persona persona, Errors errors) {

		if (errors.hasErrors()) {
			System.out.println(errors);
		}

		System.out.println(persona.getNombre() + ", " + persona.getEdad());
		return "formulario";
	}

}
