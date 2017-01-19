package com.ipartek.formacion.hola.ejercicios.herencia;

public class ComparatorPajarosVehiculos {

	public static void main(String[] args) {

		Vehiculo v1 = new Vehiculo("Seat");
		Vehiculo v2 = new Vehiculo("Ford Ka");
		v1.setPotencia(500.33f);
		v2.setPotencia(100);
		Pajaro p1 = new Pajaro("Kiwi");
		Pajaro p2 = new Pajaro("Gallina");
		p1.setNumHuevosSemana(2);
		p2.setNumHuevosSemana(500);

	}

}
