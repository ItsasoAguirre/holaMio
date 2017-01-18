package com.ipartek.formacion.hola.ejercicios.herencia;

public abstract class Circulo extends ObjetoGrafico {
	// ATRIBUTOS
	private int radio;

	// CONSTRUCTOR
	public Circulo(int x, int y) {
		super(x, y);
		this.radio = 0;
	}

	// GETTERS AND SETTERS

	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}

	// METODOS

}
