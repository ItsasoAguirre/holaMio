package com.ipartek.formacion.hola.pojo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class RecetaTest {
	Receta tortillaPatata = new Receta("Tortilla de Patata", null);
	public static Ingrediente huevos = new Ingrediente(12, "huevos", true);
	public static Ingrediente cebolla = new Ingrediente(1, "cebolla", true);
	public static Ingrediente patatas = new Ingrediente(4, "patatas", true);

	@Before
	public void setUp() throws Exception {

		tortillaPatata = new Receta("Tortilla de Patata", null);
		tortillaPatata.addIngrediente(huevos);
		tortillaPatata.addIngrediente(cebolla);
		tortillaPatata.addIngrediente(patatas);

	}

	@BeforeClass
	public static void setUpBeforeClass() {
		Receta tortillaPatata = new Receta("Tortilla de Patata", null);
		tortillaPatata.addIngrediente(huevos);
		tortillaPatata.addIngrediente(cebolla);
		tortillaPatata.addIngrediente(patatas);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {

	}

	@Test
	public void testAddIngrediente() {
		Receta r = new Receta("Tortilla de patata", null);
		int numero = r.getIngredientes().size();
		assertEquals("No deben existir ingredientes", 0, numero);

		r.addIngrediente(null);
		numero = r.getIngredientes().size();
		assertEquals("No deben existor ingredientes", 0, numero);

		r.addIngrediente(new Ingrediente(0, "", true));
		numero = r.getIngredientes().size();
		assertEquals("No deben existor ingredientes", 0, numero);

	}

	@Test
	public void testRemoveIngrediente() {

		Receta r = new Receta("Tortilla de patata", null);
		assertFalse(r.removeIngrediente(null));

	}

	@Test
	public void testConstructor() {

		Receta r = new Receta("Tortilla de patata", null);
		assertNull("Deberia estar incializado a new", r.getIngredientes());

	}

	@Test
	public void testIsGlutenFree() {

		// Ingrediente[] ingredientes = { new Ingrediente(500, "bonito", true),
		// new Ingrediente(25, "pan de sopa", true) };

		ArrayList<Ingrediente> ingredientes = new ArrayList<Ingrediente>();
		ingredientes.add(new Ingrediente((int) 0.5f, "pimiento verde", true));
		ingredientes.add(new Ingrediente(500, "bonito", true));

		// caso1 todos los ingrdientes gluten

		Receta r = new Receta("", ingredientes);

		assertFalse(" caso1 todos los ingredientes con gluten", r.isGlutenFree());

		// caso2 todos los ingredientes SIN gluten
		ingredientes.add(new Ingrediente(0, "", false));
		ingredientes.add(new Ingrediente(0, "", false));

		r = new Receta("", ingredientes);
		assertTrue(" caso 2 todos los ingredientes SIN gluten", r.isGlutenFree());

		// caso3 todos los ingredientes con y sin gluten

		ingredientes.add(new Ingrediente(0, "", true));
		ingredientes.add(new Ingrediente(0, "", false));

		r = new Receta("", ingredientes);
		assertFalse(" caso 3 todos los ingredientes con y sin gluten", r.isGlutenFree());

		// caso null

		r = new Receta("", null);
		assertTrue(" caso 4 sin ingredientes", r.isGlutenFree());
	}

}
