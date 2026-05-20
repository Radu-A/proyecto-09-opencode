package com.github.Radu_A.proyecto_09.model;

public class Saludo {

	private String nombre;
	private String mensaje;

	public Saludo() {
	}

	public Saludo(String nombre, String mensaje) {
		this.nombre = nombre;
		this.mensaje = mensaje;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
}
