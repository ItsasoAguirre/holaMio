package com.ipartek.formacion.hola.ejercicios.herencia;

import java.util.ArrayList;

/**
 * Listar todos los vehiculos del concesionario
 * 
 * @author Itsaso Aguirre
 *
 */
public class EjercicioConcesionario {

	public static void main(String[] args) {

		// TODO crear vehiculos

		ArrayList<Vehiculo> vehiculos = new ArrayList<>();
		vehiculos.add(new Vehiculo("Prius"));
		vehiculos.add(new Vehiculo("Ibiza"));
		vehiculos.add(new Vehiculo("Fiesta"));
		for (int i = 0; i < vehiculos.size(); i++) {

			System.out.println();
		}

		VehiculoElectrico vehiculoElec = new VehiculoElectrico("Tesla");
		VehiculoDiesel vehiculoDiesel = new VehiculoDiesel("Xsara");
		VehiculoDiesel vehiculoDiesel2 = new VehiculoDiesel("Astra");

		// TODO mostrar por pantalla

		System.out.println(vehiculos);
		System.out.println(vehiculoElec);
		System.out.println(vehiculoDiesel);
		System.out.println(vehiculoDiesel2);
	}

}
