package com.ipartek.formacion.hola;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class UtilidadesTest {

	@Test
	public void testBubbleSort() {

		int[] aDesordenado = { 3, 0, 1, 8, 7, 2, 5, 4, 6, 9 };
		int[] aOrdenado = Utilidades.bubblesort(aDesordenado);

		assertEquals(0, aDesordenado[0]);
		assertEquals(1, aDesordenado[1]);
		assertEquals(2, aDesordenado[2]);
		assertEquals(3, aDesordenado[3]);
		assertEquals(4, aDesordenado[4]);
		assertEquals(5, aDesordenado[5]);
		assertEquals(6, aDesordenado[6]);
		assertEquals(7, aDesordenado[7]);
		assertEquals(8, aDesordenado[8]);
		assertEquals(9, aDesordenado[9]);
	}

	@Test
	public void testGetNumAleatorio() {
		int numero = -1;
		final int NUMERO_MAXIMO = 10;
		// crear array con todo false

		boolean[] aResultado = new boolean[NUMERO_MAXIMO];

		// generar 1000 numeros aleatorios y actualizar array con true
		for (int i = 0; i < 1000; i++) {
			numero = Utilidades.getNumAleatorio(NUMERO_MAXIMO);
			aResultado[numero] = true;
		}

		// recorrer array y comprobar todo true
		for (int i = 0; i < aResultado.length; i++) {
			assertTrue(aResultado[i]);

		}
	}

	@Test
	public void testSumaTonta() {
		assertEquals("no suma bien", 5, Utilidades.sumaTonta(2, 3));
		assertEquals(0, Utilidades.sumaTonta(-2, 3));
		assertEquals(0, Utilidades.sumaTonta(2, -3));
		assertEquals(0, Utilidades.sumaTonta(-2, -3));
		assertEquals(">100 retorna 0", 0, Utilidades.sumaTonta(1, 100));
		// no funciona porque las variables primiticvas nunca pueden ser
		// null,solo los objetos
		// assertEquals(5, Utilidades.sumaTonta(null, null));
	}

	@Test
	public void testNoFallaNunca() {
		assertTrue(1 < 2);
	}

}
