package com.ipartek.formacion.hola;

import com.ipartek.formacion.hola.pojo.Libro;

/**
 * comentario java doc clase para realizar un hello world
 * 
 * @author curso
 *
 */

public class Hola {

	/**
	 * comentario java doc metodo main para ejecutar la clase
	 * 
	 * @param args
	 *            []String
	 */

	public static void main(String[] args) {

		// Comentario de linea

		/*
		 * 
		 * 
		 * 
		 * 
		 * comentario de bloque ,permite mas de una linea
		 * 
		 * 
		 * 
		 * 
		 * 
		 */

		// declarar variables
		int iInt = 3;
		boolean bBooleana = true;
		float fNumerCuenta = 10.23f; // 10,23€
		float fNumerCuenta2 = (float) 10.23; // 10,23€
		char cCaracter = 's';
		String sCadena = "dobles";

		// operador ternario
		// asignar un valor a una variable en funcion de una "condicion"
		// (condicion) ? true: false;
		int edad = (3 > 100) ? 18 : 34;

		System.out.println("Hello World");

		// instanciar un objeto de la clase libro
		Libro libroJava = new Libro(320, "Java 7", "Roberto");
		/*
		 * libroJava.numeroPaginas=320; libroJava.nombre="Java 7";
		 * libroJava.autor = " Roberto";
		 */

		System.out.println(libroJava.describete());
		System.out.println("Escribir 10 paginas");

		libroJava.escribir(10);

		System.out.println(libroJava.describete());

		Libro libroPhp = new Libro(725, "LibroPHP", "Paco");
		/*
		 * libroPhp.numeroPaginas=725; libroPhp.nombre="Libro PHP";
		 * libroPhp.autor= " Paco";
		 */

		System.out.println(libroPhp.describete());
		System.out.println("Escribir 10 paginas");

		libroPhp.escribir(10);

		System.out.println(libroPhp.describete());

	}
}
