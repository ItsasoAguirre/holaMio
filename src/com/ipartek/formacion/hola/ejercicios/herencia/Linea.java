package com.ipartek.formacion.hola.ejercicios.herencia;

public class Linea extends ObjetoGrafico {
	private int longitud;

	// CONTRUCTOR
	public Linea(int x, int y) {
		super(x, y);
		this.longitud = 0;

	}

	// METODOS
	@Override
	public void dibujar() {
		System.out.println("Pintar linea");

	}

}
