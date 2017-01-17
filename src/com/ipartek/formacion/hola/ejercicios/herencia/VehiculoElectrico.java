package com.ipartek.formacion.hola.ejercicios.herencia;

public class VehiculoElectrico extends Vehiculo {
	public final float MIN_CAPACIDAD_BATERIA = 100;
	private float capacidadBaterias;

	// CONSTRUCTOR
	public VehiculoElectrico() {
		super();
		this.capacidadBaterias = MIN_CAPACIDAD_BATERIA;

	}

	public VehiculoElectrico(String modelo) {
		super(modelo);
		this.capacidadBaterias = MIN_CAPACIDAD_BATERIA;
	}

	// GETTERS AND SETTERS
	public float getCapacidadBaterias() {
		return capacidadBaterias;
	}

	public void setCapacidadBaterias(float capacidadBaterias) {
		this.capacidadBaterias = capacidadBaterias;
	}

	// TO STRING
	@Override
	public String toString() {
		return "VehiculoElectrico [capacidadBaterias=" + capacidadBaterias + "] extends " + super.toString();
	}

}
