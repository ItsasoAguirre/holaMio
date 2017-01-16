package com.ipartek.formacion.hola;

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

		// int numAleatorio = (int) (Math.random() * aAlumnos.length);
		int numeroAleatorio = Utilidades.getNumAleatorio((aAlumnos.length - 1));
		String afortunado = aAlumnos[numeroAleatorio];
		System.out.println("El/a afortunad@ es:" + afortunado);
		System.out.println("-----------LISTADO--------");
		listar();
		listarForEach();

	}
}
