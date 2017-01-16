package com.ipartek.formacion.hola.pojo;

public class Ingrediente {
	// atributos
	private int cantidad;
	private String nombre;
	private boolean gluten;

	// Constructor
	public Ingrediente(int cantidadSet, String nombreSet, boolean glutenSet) {
		this.cantidad = cantidadSet;
		this.gluten = glutenSet;
		this.nombre = nombreSet;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isGluten() {
		return gluten;
	}

	public void setGluten(boolean gluten) {
		this.gluten = gluten;
	}

	@Override
	public String toString() {
		return "Ingrediente [cantidad=" + cantidad + ", nombre=" + nombre + ", gluten=" + gluten + "]";
	}

}
