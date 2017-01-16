package com.ipartek.formacion.hola;

/**
 * Clase {@code Utilidades} con metodos estaticos y comunes.<br>
 * Por ejemplo: crear numeros aleatorios, validaciones, etc..
 * 
 * @author Itsaso Agirre
 *
 */
public class Utilidades {
	/**
	 * Generar numero {@code int} aleatorio desde 0 hasta <b>maxValor</b>
	 * 
	 * @param maxValor
	 *            numero aleatorio maximo que puede generar, incluido este.
	 * @return numero entero aleatorio
	 */
	static public int getNumAleatorio(int maxValor) {

		int numAleatorio = (int) (Math.random() * maxValor);
		return numAleatorio;

	}

	/**
	 * Suma muy rara que se inventa el jefe, no me digas para que
	 * 
	 * @param num1
	 *            entero a sumar
	 * @param num2
	 *            enetero a sumar
	 * @return suma de los parametros , pero: <br>
	 *         si es cualquiera de los parametros es negativo return 0<br>
	 *         si la suma es superior a 100 return 0.
	 */

	static public int sumaTonta(int num1, int num2) {

		int resultado = -1;

		if (num1 < 0 || num2 < 0 || (num1 + num2 > 100)) {
			resultado = 0;

		} else {

			resultado = num1 + num2;

		}
		return resultado;

	};
}
