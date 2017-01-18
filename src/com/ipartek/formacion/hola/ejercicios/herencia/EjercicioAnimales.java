package com.ipartek.formacion.hola.ejercicios.herencia;

import java.util.ArrayList;

/**
 * Ejercicio para aprender a usar la Herencia e interfaces Capitulo 8 del libro
 * Java 7<br>
 * 
 * @author Itsaso Aguirre
 */
public class EjercicioAnimales {

	public static void main(String[] args) {

		// CREAR OBJETOS
		ArrayList<Pajaro> pajaros = new ArrayList<Pajaro>();
		pajaros.add(new Pajaro("Buitre", 517, true));
		pajaros.add(new Pajaro("Pinguino", 2217, false));
		pajaros.add(new Pajaro("Kiwi", 2457, false));
		pajaros.add(new Pajaro("Aguila Real", 3317, true));

		ArrayList<Burro> burros = new ArrayList<Burro>();
		burros.add(new Burro("Platero"));
		burros.add(new Burro("Astotxo"));
		burros.add(new Burro("Cecilio"));
		// Lo añadimos a un arralist general
		ArrayList<Animal> animales = new ArrayList<Animal>();
		animales.add(new Animal("Perro", -217));
		animales.add(new Animal("Cabra", 517));
		animales.add(new Animal("Gato", 0));
		animales.addAll(burros);
		animales.addAll(pajaros);

		// MOSTRAR POR PANTALLA

		System.out.println("+++++++++++++++LISTADO DE ANIMALES++++++++++++++");
		System.out.println();
		System.out.println();
		for (Animal animal : animales) {
			System.out.println("Raza: " + animal.getRaza());
			if (animal.vendible()) {
				System.out.println("Vendible: Si");
				System.out.println("Precio: " + animal.getPrecio() + " €");
			} else
				System.out.println("Vendible: No");

			if (animal instanceof Pajaro) {
				if (((Pajaro) animal).isVolador())
					System.out.println("Volador: Si ");
				else
					System.out.println("Volador: No ");

			} else if (animal instanceof Burro) {
				animal.setRaza("Burro");
				System.out.println("Nombre: " + ((Burro) animal).getNombre());

				if (((Burro) animal).isComestible())

					System.out.println("Comestible: Si");
				else
					System.out.println("Comestible: No");

			}
			System.out.println();
			System.out.println();
			System.out.println("****************************");

		}
	}

}
