package com.ipartek.formacion.hola.pojo;

import java.util.ArrayList;

public class Receta implements Comparable<Receta> {

	// Atributos
	public static final String FACIL = "facil";
	public static final String MODERADO = "moderado";
	public static final String DIFICIL = "dificil";
	public String IMG_DEFAULT = "http://apps.enyojs.com/assets/apps/17daydietmealplan_icon.png";
	private String titulo;
	private ArrayList<Ingrediente> ingredientes;
	private int tiempo;
	private String dificultad;
	private int comensales;
	private String descripcion;
	private String imagen;

	// CONSTRUCTORES
	public Receta(String titulo) {
		super();
		this.titulo = titulo;
		this.imagen = IMG_DEFAULT;
		setIngredientes(null);
		this.tiempo = 0;
		this.comensales = 0;
		this.dificultad = "facil";
		this.descripcion = "Lorem ipsum....";
	}

	public Receta(String titulo, ArrayList<Ingrediente> ingredientes) {
		super();
		this.titulo = titulo;
		this.imagen = IMG_DEFAULT;
		setIngredientes(ingredientes);
		this.tiempo = 0;
		this.comensales = 0;
		this.dificultad = "facil";
		this.descripcion = "Lorem ipsum....";
	}

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

	// GETTERS AND SETTERS
	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public ArrayList<Ingrediente> getIngredientes() {
		return ingredientes;
	}

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

		boolean resul = false;
		if (ingrediente != null) {
			final String NOMBRE_RECETA_BUSCAR = ingrediente.getNombre();
			for (Ingrediente iterateIngredient : ingredientes) {
				if (NOMBRE_RECETA_BUSCAR.equalsIgnoreCase(iterateIngredient.getNombre())) {
					resul = true;
					break;
				}
			}
		}
		return resul;
	}

	/**
	 * Metodo implentado a traves de la interfaz compare<br>
	 * Ordena alfabeticamente por titulo<br>
	 * 
	 * @param o
	 *            receta a comparar
	 * 
	 * 
	 * @return retorna 0( objetos iguales), 1(o1 mayor) , -1(o2 mayor)
	 */

	@Override
	public int compareTo(Receta o) {
		int resul = 0;

		// Pasamos a -toLowerCase para ignorar mayusculas y minusculas
		resul = this.getTitulo().toLowerCase().compareTo(o.getTitulo().toLowerCase());

		return resul;
	}

	// TO STRING

	@Override
	public String toString() {
		return "Receta [IMG_DEFAULT=" + IMG_DEFAULT + ", titulo=" + titulo + ", ingredientes=" + ingredientes
				+ ", tiempo=" + tiempo + ", dificultad=" + dificultad + ", comensales=" + comensales + ", descripcion="
				+ descripcion + ", imagen=" + imagen + "]";
	}

}