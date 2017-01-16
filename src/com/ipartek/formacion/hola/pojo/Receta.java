package com.ipartek.formacion.hola.pojo;

import java.util.ArrayList;

public class Receta {

	// Atributos
	private String titulo;
	private ArrayList<Ingrediente> ingredientes;
	private int tiempo;
	private String dificultad;
	private int comensales;
	private String descripcion;

	// CONSTRUCTORES

	public Receta(String titulo, ArrayList<Ingrediente> ingredientes, int tiempo, String dificultad, int comensales,
			String descripcion) {
		super();
		this.titulo = titulo;
		// this.ingredientes = ingredientes;
		setIngredientes(ingredientes);
		this.tiempo = tiempo;
		this.dificultad = dificultad;
		this.comensales = comensales;
		this.descripcion = descripcion;
	}

	public Receta(String titulo, ArrayList<Ingrediente> ingredientes) {
		super();
		this.titulo = titulo;
		this.ingredientes = ingredientes;
		this.dificultad = "facil";
		this.descripcion = "Lorem ipsum...";
		this.comensales = 0;
		this.tiempo = 0;
	}

	@Override
	public String toString() {
		return "Receta [titulo=" + titulo + ", ingredientes=" + ingredientes + ", tiempo=" + tiempo + ", dificultad="
				+ dificultad + ", comensales=" + comensales + ", descripcion=" + descripcion + "]";
	}

	// GETTERS AND SETTERS
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public ArrayList<Ingrediente> getIngredientes() {
		return ingredientes;
	}

	// TODO analizar que hace
	public void setIngredientes(ArrayList<Ingrediente> ingredientes) {
		this.ingredientes = (ingredientes == null) ? new ArrayList<Ingrediente>() : ingredientes;
	}

	public int getTiempo() {
		return tiempo;
	}

	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}

	public String getDificultad() {
		return dificultad;
	}

	public void setDificultad(String dificultad) {
		this.dificultad = dificultad;
	}

	public int getComensales() {
		return comensales;
	}

	public void setComensales(int comensales) {
		this.comensales = comensales;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	// METODOS
	// TODO resalizar test para gluten

	/**
	 * Nos indica si la receta esta libre de ingredientes con gluten
	 * 
	 * @return true si todos los ingredientes no contienen gluten<br>
	 *         false si alguno de los ingredientes contiene gluten<br>
	 *         true si no existen ingredientes
	 */
	public boolean isGlutenFree() {
		boolean resultado = true;

		// Comprobar primero si es nulo
		if (this.ingredientes != null) {
			for (Ingrediente i : this.ingredientes) {
				if (i.isGluten()) {
					resultado = false;
					// como encontramos un ingrediente con gluten no hace falta
					// mas y salimos con el break
					break;
				}
			}
		}

		return resultado;
	}

	/**
	 * 
	 * TODO cuando sea null lanzar Exception personalizada<br>
	 * Añadimos un nuevo {@code Ingrediente} a la receta
	 * 
	 * @param ingrediente
	 *            si es null no hace nada
	 */
	public void addIngrediente(Ingrediente ingrediente) {

		// Añadimos el ingrediente si es diferente a nulo
		if (ingrediente != null) {
			this.ingredientes.add(ingrediente);
		}

	}

	/**
	 * Elimina el primer ingrediente que encuentre con el mismo
	 * <code>nombre</code> CaseInsensitive
	 * 
	 * @param ingrediente
	 *            ingrediente a eliminar
	 * @return true si elimina ingrediente<br>
	 *         false caso contrario
	 */
	public boolean removeIngrediente(Ingrediente ingrediente) {

		boolean resul = false;
		final String NOMBRE_INGREDIENTE_ELIMINAR = ingrediente.getNombre();

		if (ingrediente != null) {
			Ingrediente iterateIngredient = null;
			// recorremos todos los ingredientes
			for (int i = 0; i < this.ingredientes.size(); i++) {
				iterateIngredient = this.ingredientes.get(i);

				if (NOMBRE_INGREDIENTE_ELIMINAR.equalsIgnoreCase(iterateIngredient.getNombre())) {
					this.ingredientes.remove(i);
					resul = true;
					break;
				}
			} // end for
		} // end if

		return resul;
	}

	/**
	 * Comprueba si tiene el {@code Ingrediente} pasado como parametro
	 * 
	 * @param ingrediente
	 *            {@code Ingrediente} a buscar
	 * @return true si contiene el ingrediente<br>
	 *         false en caso contrario
	 */
	public boolean contiene(Ingrediente ingrediente) {

		return false;
	}

}