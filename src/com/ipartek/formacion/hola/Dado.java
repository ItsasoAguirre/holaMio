package com.ipartek.formacion.hola;

import java.util.Arrays;

public class Dado {

	static String[] aAlumnos = { "Aaron", "Eneko", "Itsaso", "Iván", "Guillermo", "Lozoya", "Josu", "Ignacio", "Gomez",
			"Nerea", "Nagore", "Garbiñe", "Egoitz", "Pavel", "Pérez" };

	public static void listar() {
		for (int i = 0; i < aAlumnos.length; i++) {
			System.out.println(i + " - " + aAlumnos[i]);
		}
	}

	public static void listarForEach() {

		for (String alumno : aAlumnos) {
			System.out.println(alumno);
		}
	}

	public static void main(String[] args) {

		int[] aDesordenado = { 2, 0, 1, 9, 6, 8, 5, 3, 4, 7 };
		// Para ordenadar arrays propio de java
		Arrays.sort(aDesordenado);

		// Utilidades.bubblesort(aDesordenado);
		for (int i = 0; i < aDesordenado.length; i++) {
			System.out.println(aDesordenado[i]);

		}

		// int numAleatorio = (int) (Math.random() * aAlumnos.length);
		int numeroAleatorio = Utilidades.getNumAleatorio((aAlumnos.length - 1));
		String afortunado = aAlumnos[numeroAleatorio];
		System.out.println("El/a afortunad@ es:" + afortunado);
		System.out.println("-----------LISTADO--------");
		listar();
		listarForEach();

	}
}
