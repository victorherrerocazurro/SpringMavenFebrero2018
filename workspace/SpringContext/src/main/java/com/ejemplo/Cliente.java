package com.ejemplo;

public class Cliente {

	private Direccion direccion;
	private String nombre;
	public Direccion getDireccion() {
		return direccion;
	}
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Cliente(Direccion direccion, String nombre) {
		super();
		this.direccion = direccion;
		this.nombre = nombre;
	}
	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}
}
