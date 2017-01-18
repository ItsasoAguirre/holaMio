package com.ipartek.formacion.hola.ejercicios;

import java.util.ArrayList;

import com.ipartek.formacion.hola.pojo.Ingrediente;
import com.ipartek.formacion.hola.pojo.Receta;

public class RecetaMarmitako {
	public static ArrayList<Ingrediente> ingredientes;
	// public static Ingrediente[] ingredientes = new Ingrediente[13];
	public static Receta recetaMarmitakoAR = new Receta("Marmitako", null, 90, "media", 4,
			"Corta el bonito en tacos y ponlos en un recipiente. Mezcla 20 g de sal con 1 l de agua, vierte la mezcla sobre el bonito y deja que macere durante 45 minutos aproximadamente. Pela los ajos, lamina y ponlos a rehogar en una cazuela grande un chorrito de aceite. Pica la cebolleta y el pimiento verde en dados y añádelos. Sazona y rehógalos bien.Agrega, el pan troceado, la guindilla cayena, los tomates secos y el pimiento choricero. Rehoga un poco, vierte el brandy y flambea. Cubre con el caldo de pescado. Pela y casca las patatas y añádelas. Cocina todo a fuego suave durante 20-30 minutos. Pon a punto de sal. Retira el pimiento choricero y los tomates secos y tritúralos con la batidora eléctrica. Vuelve a añadir a la cazuela e introduce el bonito (escurrido). Apaga el fuego y termina de cocinar con el calor residual durante unos minutos. Sirve el marmitako y decora con una hojita de perejil.");

	static void setIngredientes() {

		Ingrediente bonito = new Ingrediente(500, "bonito", false);
		Ingrediente sopa = new Ingrediente(25, "pan de sopa", false);
		Ingrediente ajo = new Ingrediente(4, "dientes de ajo", false);
		Ingrediente pimiento = new Ingrediente(1, "pimiento verde", false);
		Ingrediente aceite = new Ingrediente(1, "aceite de oliva", false);
		Ingrediente tomate = new Ingrediente(2, "tomates secos", false);
		Ingrediente sal = new Ingrediente(20, "sal", false);
		Ingrediente caldo = new Ingrediente((int) 1.5f, "caldo de pescado", false);
		ingredientes.add(bonito);
		ingredientes.add(sopa);
		ingredientes.add(ajo);
		ingredientes.add(pimiento);
		ingredientes.add(aceite);
		ingredientes.add(tomate);
		ingredientes.add(sal);
		ingredientes.add(caldo);

	};

	static public void sacarPantalla() {
		System.out.println("Titulo de la receta: " + recetaMarmitakoAR.getTitulo() + " Tiempo necesario: "
				+ recetaMarmitakoAR.getTiempo() + " minutos" + " Dificultad: " + recetaMarmitakoAR.getDificultad()
				+ " Numero de comensales: " + recetaMarmitakoAR.getComensales());
		if (recetaMarmitakoAR.isGlutenFree()) {
			System.out.println("Receta libre de gluten");

		}

		System.out.println("+++++INGREDIENTES+++++");
		for (Ingrediente ingrediente : ingredientes) {

			System.out.println(ingrediente.getNombre() + ingrediente.getCantidad());
		}
		System.out.println(recetaMarmitakoAR.getDescripcion());

	}

	public static void main(String[] args) {
		Receta mamitako = new Receta("Mamitako by Karlos Arguiñano", ingredientes);
		setIngredientes();

		sacarPantalla();
	}

}
