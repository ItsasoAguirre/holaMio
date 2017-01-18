package com.ipartek.formacion.hola.ejercicios.herencia;

public class Vehiculo implements Conducible {

	private int numPlazas;
	private float dimensiones;
	private float potencia;
	private String modelo;

	// CONSTRUCTORES
	public Vehiculo() {
		super();
		this.modelo = "";
		this.numPlazas = 1;
		this.dimensiones = 0;
		this.potencia = 100;
	}

	public Vehiculo(String modelo) {
		this();
		this.modelo = modelo;
	}

	// GETTERS AND SETTERS

	public int getNumPlazas() {
		return numPlazas;
	}

	public void setNumPlazas(int numPlazas) {
		this.numPlazas = numPlazas;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public float getDimensiones() {
		return dimensiones;
	}

	public void setDimensiones(float dimensiones) {
		this.dimensiones = dimensiones;
	}

	public float getPotencia() {
		return potencia;
	}

	public void setPotencia(float potencia) {
		this.potencia = potencia;
	}

	// METODOS
	@Override
	public void arrancar() {

	}

	@Override
	public void detener() {

	}

	@Override
	public void girar(String direccion) {

	}

	// TO STRING

	@Override
	public String toString() {
		return "Vehiculo [numPlazas=" + numPlazas + ", dimensiones=" + dimensiones + ", potencia=" + potencia
				+ ", modelo=" + modelo + "]";
	}

}
