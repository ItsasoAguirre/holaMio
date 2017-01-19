package com.ipartek.formacion.hola.ejercicios.herencia;

public class Pajaro extends Animal implements Volador, Vendible, IEstupida {

	final boolean PUEDE_VOLAR = true;
	private boolean volador;
	private int numHuevosSemana;
	// CONSTRUCTORES

	public Pajaro(String raza, float precio, boolean volador) {
		super(raza, precio);
		this.volador = volador;
		numHuevosSemana = 0;

	}

	// GETTERS AND SETTERS
	public int getNumHuevosSemana() {
		return numHuevosSemana;
	}

	public void setNumHuevosSemana(int numHuevosSemana) {
		this.numHuevosSemana = numHuevosSemana;
	}

	public boolean isVolador() {
		return volador;
	}

	public void setVolador(boolean volador) {
		this.volador = volador;
	}

	// METODOS

	@Override
	public void generarFactura() {

	}

	@Override
	public void despegar() {

	}

	@Override
	public void aterrizar() {

	}

	@Override
	public int getPeso() {
		return numHuevosSemana;

	}

	// TO STRING

	@Override
	public String toString() {
		return "Pajaro [PUEDE_VOLAR=" + PUEDE_VOLAR + ", volador=" + volador + ", numHuevosSemana=" + numHuevosSemana
				+ "]";
	}

}
