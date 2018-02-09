package com.ejemplo.controller;

import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ejemplo.Persona;

@Controller
@RequestMapping(path="/Persona")
public class RestController {

	@ResponseBody
	@GetMapping(path="/{nombre}",produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Persona> get(@PathVariable String nombre) {
		return new ResponseEntity<Persona>(new Persona(nombre, 22),HttpStatus.OK);
	}
	@ResponseBody
	@PostMapping(consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Void> post(@RequestBody Persona persona) throws URISyntaxException {
		System.out.println(persona.getNombre() + ", " + persona.getEdad());
		HttpHeaders headers = new HttpHeaders();
		
		headers.setLocation(new URI("http://localhost:8080/SpringWebMvc/Persona/" + persona.getNombre()));
		
		return new ResponseEntity<>(headers , HttpStatus.CREATED);
	}
}
