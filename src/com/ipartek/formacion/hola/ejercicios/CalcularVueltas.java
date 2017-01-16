package com.ipartek.formacion.hola.ejercicios;

public class CalcularVueltas {

	public static void main(String[] args) {

		float compra = (float) 1326.24;
		float pago = 4 * 500;
		float vueltas = (pago - compra);

		// billetes
		float[] aBilletes = { 50, 20, 10, 5, 2, 1, 0.5f, 0.2f, 0.1f, 0.05f, 0.02f, 0.01f };
		String[] aNombres = { "Billetes de 50", "Billetes de 20", "Billetes de 10", "Billetes de 5", "Monedas de 2",
				"Monedas de 1", "Monedas de 0,5", "Monedas de 0,2", "Monedas de 0,1", "Monedas de 0,05",
				"Monedas de 0,02", "Monedas de 0,01" };
		int i = 0;
		int cont = 0;
		while (vueltas > 0 && i < aBilletes.length) {

			if (vueltas - aBilletes[i] >= 0) {
				cont++; // Incrementamos para saber que tiene uno de ese tipo
				vueltas = vueltas - aBilletes[i]; // Restamos un billete del
													// tipo que corresponda

			} else {
				aBilletes[i] = cont;
				cont = 0;
				i++;
			}
		}

		System.out.println("-----------------------------");
		System.out.println("-------TICKET----------------");
		System.out.println("-----------------------------");
		System.out.println("PAGO: " + compra + "€");
		System.out.println("RETORNO: " + (pago - compra) + "€");
		System.out.println("------------------------------");
		System.out.println("Las vueltas");
		for (int e = 0; e < aBilletes.length; e++) {
			System.out.println(aNombres[e] + ": " + (int) aBilletes[e]);

		}
		System.out.println("------------------------------");
		System.out.println("++ gracias por su visita ++");
		System.out.println("------------------------------");

	}

}
