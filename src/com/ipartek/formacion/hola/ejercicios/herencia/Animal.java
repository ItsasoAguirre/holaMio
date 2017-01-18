package com.ipartek.formacion.hola.ejercicios.herencia;

public class Animal {

	// ATRIBUTOS
	final private boolean VENDIBLE = true;
	private String raza;
	private float precio;
	private boolean vendible;

	// CONSTRUCTOR
	public Animal(String raza, float precio) {
		super();
		this.raza = raza;
		this.precio = precio;
	}

	public Animal() {
		super();
	}

	// GETTERS AND SETTERS
	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	// METODOS

	public boolean vendible() {
		this.vendible = VENDIBLE;
		if (this.precio <= 0) {
			vendible = false;
		}
		;
		return vendible;
	}
}
