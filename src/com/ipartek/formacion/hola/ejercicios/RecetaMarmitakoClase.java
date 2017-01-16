package com.ipartek.formacion.hola.ejercicios;

import com.ipartek.formacion.hola.pojo.Ingrediente;
import com.ipartek.formacion.hola.pojo.Receta;

public class RecetaMarmitakoClase {

	public static void main(String[] args) {
		// Crear ingredientes
		Ingrediente[] ingredientes = { new Ingrediente(500, "bonito", false), new Ingrediente(25, "pan de sopa", false),
				new Ingrediente(4, "patata", false), new Ingrediente(1, "cebolleta", false),
				new Ingrediente(1, "pimiento verde", false), new Ingrediente(4, "dientes de ajo", false),
				new Ingrediente((int) 1.5f, "caldo de pescado", false), new Ingrediente(1, "copa brandy", false),
				new Ingrediente(1, "aceite de oliva", false), new Ingrediente(1, "pimiento choricero", false),
				new Ingrediente(2, "tomates secos", false), new Ingrediente(1, "guindilla cayena", false),
				new Ingrediente(20, "sal", false) };

		// crear receta
		Receta marmitako = new Receta("Mamitako by Karlos Arguiñano", ingredientes);
		marmitako.setComensales(16);
		marmitako.setDescripcion("vdkflgna");
		marmitako.setDificultad("moderado");
		marmitako.setTiempo(90);

		if (!marmitako.isGlutenFree()) {
			System.out.println("*****CONTIENE GLUTEN****, atencion alergicos");
		}
		System.out.println(marmitako.toString());
	}

}
