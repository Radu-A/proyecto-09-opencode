package com.github.Radu_A.proyecto_09.model;

public class Animal {

	private String nombre;
	private String tipo;
	private String descripcion;

	public Animal() {
	}

	public Animal(String nombre, String tipo, String descripcion) {
		this.nombre = nombre;
		this.tipo = tipo;
		this.descripcion = descripcion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Animal{" +
				"nombre='" + nombre + '\'' +
				", tipo='" + tipo + '\'' +
				", descripcion='" + descripcion + '\'' +
				'}';
	}
}
