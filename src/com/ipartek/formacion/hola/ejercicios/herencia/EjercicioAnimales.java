package com.ipartek.formacion.hola.ejercicios.herencia;

import java.util.ArrayList;

public class EjercicioAnimales {

	public static void main(String[] args) {

		ArrayList<Pajaro> pajaros = new ArrayList<Pajaro>();
		pajaros.add(new Pajaro("Buitre", 517, true));
		pajaros.add(new Pajaro("Pinguino", 2217, false));

		ArrayList<Burro> burros = new ArrayList<Burro>();
		burros.add(new Burro("Platero", 317));
		burros.add(new Burro("Astotxo", 234));

		ArrayList<Animal> animales = new ArrayList<Animal>();
		animales.add(new Animal("Perro", -217));
		animales.add(new Animal("Cabra", 517));
		animales.add(new Animal("Gato", 0));
		animales.addAll(burros);
		animales.addAll(pajaros);

		// TODO mostrar por pantalla

		System.out.println("+++++++++++++++LISTADO DE ANIMALES++++++++++++++");
		for (Animal animal : animales) {
			System.out.println("Raza: " + animal.getRaza());
			if (animal.vendible()) {
				System.out.println("Vendible: Si");
				System.out.println("Precio: " + animal.getPrecio() + " €");
			} else
				System.out.println("Vendible: No");

			if (animal instanceof Pajaro) {
				if (((Pajaro) animal).puedeVolar())

					// ((VehiculoElectrico) vehiculo).getCapacidadBaterias();
					System.out.println("Volador: Si ");
				else
					System.out.println("Volador: No ");

			} else if (animal instanceof Burro) {

				if (((Burro) animal).isComestible())

					System.out.println("Comestible: Si");
				else
					System.out.println("Comestible: No");

			}

			// ((VehiculoDiesel) vehiculo).getCapacidadDeposito();

			System.out.println("****************************");
		}
	}

}
