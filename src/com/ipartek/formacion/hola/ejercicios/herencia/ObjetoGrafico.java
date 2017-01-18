package com.ipartek.formacion.hola.ejercicios.herencia;

/**
 * 
 * 
 * @author Itsaso Aguirre
 *
 */
public abstract class ObjetoGrafico {

	private int x;
	private int y;

	/**
	 * Se compone de una longiud y latitud, mediante una clase interna
	 */
	private GeoPunto gp;

	/**
	 * 
	 * @author Curso Clase interna
	 */
	class GeoPunto {

		// ATRIBUTOS
		public float latitud;
		public float longitud;

		// GETERS AND SETTERS
		public float getLatitud() {
			return latitud;
		}

		public void setLatitud(float latitud) {
			this.latitud = latitud;
		}

		public float getLongitud() {
			return longitud;
		}

		public void setLongitud(float longitud) {
			this.longitud = longitud;
		}

	}

	// CONSTRUCTOR
	public ObjetoGrafico(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	// GETTERS AND SETTERS
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	// METODOS

	void mover(int x, int y) {
		System.out.println("Objeto movido a nueva posicion" + x + " " + y);
	}

	// Metodo abstracto se implemtenta en los hijos porque no tiene los valores
	public abstract void dibujar();

	// TO STRING
	@Override
	public String toString() {
		return "ObjetoGrafico [x=" + x + ", y=" + y + "]";
	}

}
