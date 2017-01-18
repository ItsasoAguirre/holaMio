package com.ipartek.formacion.hola.ejercicios.herencia;

import java.util.ArrayList;

import com.ipartek.formacion.hola.pojo.Ingrediente;

public class Burro extends Animal implements Conducible, Cocinable, Vendible {

	// ATRIBUTOS
	private String nombre;
	private final boolean COMESTIBLE = false;
	private boolean comestible;

	// CONSTRUCTOR
	public Burro(String nombre) {
		super("Burro", 0);
		this.nombre = nombre;
	}

	// GETERS AND SETTERS
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean getComestible() {
		return comestible;
	}

	public void setComestible(boolean comestible) {
		this.comestible = comestible;
	}

	// METODOS

	public boolean isComestible() {
		this.comestible = COMESTIBLE;
		if (this.getDescripcionReceta() != null) {
			comestible = true;
		}

		return comestible;

	}

	@Override
	public void arrancar() {
		System.out.println("Arre burro");

	}

	@Override
	public void detener() {
		System.out.println("soooooo");

	}

	@Override
	public void girar(String direccion) {
		System.out.println("giro a " + direccion);

	}

	@Override
	public ArrayList<Ingrediente> getIngredientes() {

		return new ArrayList<Ingrediente>();
	}

	@Override
	public String getDescripcionReceta() {

		return "Sal pimentar y a la cazuela";
	}

	@Override
	public void generarFactura() {
		System.out.println("Factura generada");

	}

	// TO STRING

	@Override
	public String toString() {
		return "Burro [nombre=" + nombre + ", comestible=" + comestible + "]";
	}
}
