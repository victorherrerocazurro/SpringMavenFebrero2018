package com.ejemplo;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class PersonaValidator implements Validator {
	
	@Override
	public boolean supports(Class<?> clazz) {
		return Persona.class.equals(clazz);
	}

	@Override
	public void validate(Object obj, Errors e) {
		Persona persona = (Persona) obj;
		e.rejectValue("nombre", "formulario.error.persona.nombre", "Desde la clase un error");
	}
}