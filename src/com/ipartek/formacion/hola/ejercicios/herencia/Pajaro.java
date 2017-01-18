package com.ipartek.formacion.hola.ejercicios.herencia;

public class Pajaro extends Animal implements Volador, Vendible {

	final boolean PUEDE_VOLAR = true;
	private boolean volador;
	// CONSTRUCTORES

	public Pajaro(String raza, float precio, boolean volador) {
		super(raza, precio);
		this.volador = volador;

	}

	// METODOS

	@Override
	public void generarFactura() {
		// TODO Auto-generated method stub

	}

	@Override
	public void despegar() {
		// TODO Auto-generated method stub

	}

	@Override
	public void aterrizar() {
		// TODO Auto-generated method stub

	}

	public boolean puedeVolar() {
		return volador;
	}

}
