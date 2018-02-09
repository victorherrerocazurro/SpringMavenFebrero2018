package com.ejemplo;

import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.NotEmpty;

public class Persona {

	@NotEmpty
	private String nombre;
	@Min(3)
	private int edad;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public Persona(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}
	public Persona() {
		super();
	}
}
