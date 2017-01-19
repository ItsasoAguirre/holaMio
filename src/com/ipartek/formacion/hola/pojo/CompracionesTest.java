package com.ipartek.formacion.hola.pojo;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CompracionesTest {
	ArrayList<Receta> recetas = new ArrayList<Receta>();
	Receta solomillo = new Receta("Solomillo");
	Receta marmitako = new Receta("Marmitako");
	Receta tortilla = new Receta("Tortilla de Patata");

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {

		// SOLOMILLO

		solomillo.setDificultad("moderado");
		ArrayList<Ingrediente> ingredientesSolomillo = new ArrayList<Ingrediente>();
		ingredientesSolomillo.add(new Ingrediente("Solomillo", 0.5f, false));
		ingredientesSolomillo.add(new Ingrediente("Aceite", 500, false));
		ingredientesSolomillo.add(new Ingrediente("ajo", 1, false));

		// MARMITAKO

		marmitako.setDificultad("dificil");
		ArrayList<Ingrediente> ingredientesMarmitako = new ArrayList<Ingrediente>();
		ingredientesMarmitako.add(new Ingrediente("pimiento verde", 0.5f, false));
		ingredientesMarmitako.add(new Ingrediente("Bonito", 500, false));
		ingredientesMarmitako.add(new Ingrediente("patatas", 4, false));
		ingredientesMarmitako.add(new Ingrediente("ajo", 1, false));

		// TORTILLA

		tortilla.setDificultad("facil");
		ArrayList<Ingrediente> ingredientesTortilla = new ArrayList<Ingrediente>();
		ingredientesTortilla.add(new Ingrediente("Azucar", 0.5f, false));
		ingredientesTortilla.add(new Ingrediente("Nata", 500, false));
		ingredientesTortilla.add(new Ingrediente("Huevo", 1, false));

		// Las Añadimos a un arrayList
		recetas.add(solomillo);
		recetas.add(tortilla);
		recetas.add(marmitako);

	}

	@After
	public void tearDown() throws Exception {
		recetas = null;
		tortilla = null;
		marmitako = null;
		solomillo = null;
	}

	@Test
	public void testComparable() {

		// ordenar de A-Z
		Collections.sort(recetas);

		// comprobar
		assertEquals(marmitako, recetas.get(0));
		assertEquals(solomillo, recetas.get(1));
		assertEquals(tortilla, recetas.get(2));

		// ordenar de la Z-A
		Collections.sort(recetas, Collections.reverseOrder());
		assertEquals(marmitako, recetas.get(2));
		assertEquals(solomillo, recetas.get(1));
		assertEquals(tortilla, recetas.get(0));

	}

	/**
	 * Test para comprobar si ordena las recetas por nivel de dificultad
	 */
	@Test
	public void testComparator() {

		final String MSG_ERROR_DIFICULTAD = "No ordena por nivel de dificultad";
		// Ordena
		Collections.sort(recetas, new ComparatorRecetaNivelDificultad());

		// recetas

		assertEquals(MSG_ERROR_DIFICULTAD, tortilla, recetas.get(0));
		assertEquals(MSG_ERROR_DIFICULTAD, solomillo, recetas.get(1));
		assertEquals(MSG_ERROR_DIFICULTAD, marmitako, recetas.get(2));

	}

}
