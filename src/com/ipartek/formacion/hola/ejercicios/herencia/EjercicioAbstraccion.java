package com.ipartek.formacion.hola.ejercicios.herencia;

/**
 * Comprobar que solo podemos instaciar objetos de las clases que no sean
 * abstractas
 * 
 * @author Curso
 *
 */
public class EjercicioAbstraccion {

	public static void main(String[] args) {
		// No se puede instanciar por ser abstracto
		// ObjetoGrafico og=new ObjetoGrafico(0,0)

		// En principio no se puede instanciar un objeto de Clase abstracta, a
		// menos que se implemente en el momento de la instanciacion.No es una
		// buena practica en Java

		/**
		 * Clase anonima
		 */
		Circulo c = new Circulo(0, 0) {

			@Override
			public void dibujar() {
				System.out.println("Dibujando Circulo");

			}

		};

		Linea linea = new Linea(0, 0);

		CirculoNoAbstracto cNA = new CirculoNoAbstracto(0, 0);

		c.dibujar();
	}

}
