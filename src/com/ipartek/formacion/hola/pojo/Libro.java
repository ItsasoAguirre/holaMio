package com.ipartek.formacion.hola.pojo;

/**
 * 
 * 
 * Clase {@code Libro} representa un {@code Libro} a la que hay que darle los
 * siguientes valores int numeroPaginas, String nombre, String autor privados
 * que se facilitan mediante un constructor Tiene dos funciones: describete y
 * escribir
 * 
 * @author Itsaso Agirre
 *
 */

public class Libro {

	// Atributos

	/*
	 * numero paginas que contiene el Libro
	 * 
	 */
	private int numeroPaginas;
	/**
	 * nombre del libro
	 */
	private String nombre;
	/*
	 * autor del libro
	 */
	private String autor;

	/**
	 * constructor sin parametros
	 */
	public Libro() {

	}

	/**
	 * constructor al que hay que pasarle un int (numero paginas), string
	 * (titulo) , string(autor)
	 * 
	 * @param numeroPaginasDado
	 *            numero de paginas que se aporta
	 * @param nombreDado
	 *            nombre del libro dado
	 * @param autorDado
	 *            autor del libro dado
	 * 
	 * 
	 */
	public Libro(int numeroPaginasDado, String nombreDado, String autorDado) {
		numeroPaginas = numeroPaginasDado;
		nombre = nombreDado;
		autor = autorDado;
	}

	// metodos o funciones

	/**
	 * metodo que retorna un string con los datos del libro
	 */
	public String describete() {

		return "Descripción: " + this.nombre + ", autor:" + this.autor + ", páginas: " + this.numeroPaginas;

	}

	/**
	 * Aumenta el atributo numeroPaginas
	 * 
	 * @param numPaginas
	 *            <code>int</code> numero paginas nuevas escritas
	 */

	public void escribir(int numPaginas) {
		// this.numeroPaginas= this.numeroPaginas + numPaginas;
		this.numeroPaginas += numPaginas;

	}

}
