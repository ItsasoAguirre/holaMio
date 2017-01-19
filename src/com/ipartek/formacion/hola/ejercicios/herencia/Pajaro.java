package com.ipartek.formacion.hola.ejercicios.herencia;

import java.util.Comparator;

public class Pajaro extends Animal implements Volador, Vendible, IEstupida, Comparator<Pajaro> {

	final boolean PUEDE_VOLAR = true;
	private boolean volador;
	private int numHuevosSemana;
	// CONSTRUCTORES

	public Pajaro(String raza, float precio, boolean volador) {
		super(raza, precio);
		this.volador = volador;
		numHuevosSemana = 0;

	}

	public Pajaro(String raza) {
		super();
		this.volador = volador;
		numHuevosSemana = 0;
		this.volador = false;

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
	public int compare(Pajaro o1, Pajaro o2) {

		return getPeso(o1) - getPeso(o2);

	}

	@Override
	public int getPeso(Object Pajaro) {
		int resul = 0;

		Pajaro pajaro = this;
		resul = pajaro.getNumHuevosSemana();

		return resul;
	}

	// TO STRING

	@Override
	public String toString() {
		return "Pajaro [PUEDE_VOLAR=" + PUEDE_VOLAR + ", volador=" + volador + ", numHuevosSemana=" + numHuevosSemana
				+ "]";
	}

}
