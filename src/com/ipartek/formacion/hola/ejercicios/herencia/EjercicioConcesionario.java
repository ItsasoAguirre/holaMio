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

		ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();

		vehiculos.add(new Vehiculo("Prius"));
		vehiculos.add(new Vehiculo("Ibiza"));
		vehiculos.add(new Vehiculo("Fiesta"));
		for (int i = 0; i < vehiculos.size(); i++) {

			System.out.println();
		}

		VehiculoElectrico vehiculoElec = new VehiculoElectrico("Tesla");
		VehiculoDiesel vehiculoDiesel = new VehiculoDiesel("Xsara");
		VehiculoDiesel vehiculoDiesel2 = new VehiculoDiesel("Astra");
		vehiculos.add(vehiculoElec);
		vehiculos.add(vehiculoDiesel);
		vehiculos.add(vehiculoDiesel2);

		for (Vehiculo vehiculo : vehiculos) {
			System.out.println("Modelo: " + vehiculo.getModelo());
			System.out.println("Plazas: " + vehiculo.getNumPlazas());
			System.out.println("Potencia: " + vehiculo.getPotencia());
			if (vehiculo instanceof VehiculoElectrico) {
				// ((VehiculoElectrico) vehiculo).getCapacidadBaterias();
				System.out.println("Capacidad bateria: " + ((VehiculoElectrico) vehiculo).getCapacidadBaterias());
			} else if (vehiculo instanceof VehiculoDiesel) {
				// ((VehiculoDiesel) vehiculo).getCapacidadDeposito();
				System.out.println("Combustible: " + ((VehiculoDiesel) vehiculo).getCapacidadDeposito());
			}
			System.out.println("****************************");
		}

	}

}
