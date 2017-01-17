package com.ipartek.formacion.hola.ejercicios.herencia;

public class VehiculoDiesel extends Vehiculo {
	public final float MIN_CAPACIDAD_DEPOSITO = 90;

	private float capacidadDeposito;

	public VehiculoDiesel() {
		super();
		this.capacidadDeposito = MIN_CAPACIDAD_DEPOSITO;

	}

	public VehiculoDiesel(String modelo) {
		super(modelo);
		this.capacidadDeposito = MIN_CAPACIDAD_DEPOSITO;

	}

	// GETTERS AND SETTERS
	public float getCapacidadDeposito() {
		return capacidadDeposito;
	}

	public void setCapacidadDeposito(float capacidadDeposito) {
		this.capacidadDeposito = capacidadDeposito;
	}

	// TO STRING
	@Override
	public String toString() {
		return "VehiculoDiesel [capacidadDeposito=" + capacidadDeposito + "]extends " + super.toString();
	}

}
