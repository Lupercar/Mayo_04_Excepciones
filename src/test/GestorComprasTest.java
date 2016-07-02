package test;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import entidades.Compra;
import entidades.GestorCompras;

public class GestorComprasTest {

	private GestorCompras gc = null;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		// Se ejecuta este método sólo una vez antes de iniciar los tests

	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		// Se ejecuta este método sólo una vez al finalizar todos los test

	}

	@Before
	public void setUp() throws Exception {
		// Se ejecuta este método antes de cada tests
		gc = new GestorCompras();
	}

	@After
	public void tearDown() throws Exception {
		// Se ejecuta este método después de cada tests
	}

	@Test
	public void testAddCompra() {
		Date fecha = new Date();
		gc.addCompra(new Compra(1, fecha, 1.00));
		assertEquals("Numero de elementos erróneos", 1, gc.numeroCompras());
		assertEquals("El código de la compra es incorrecto", 
				1, 
				gc.getCompras().get(0).getCodigo());
		assertEquals("Fecha de compra es incorrecta", 
				fecha, 
				gc.getCompras().get(0).getFecha());
		assertTrue("Precio de compra incorrecto", 
				1.00 == gc.getCompras().get(0).getPrecio());
	}

	@Test
	public void testRemoveCompra() {
		Compra p = new Compra(1, new Date(), 1.00); 
		gc.addCompra(p);
		try {
			gc.removeCompra(p);
		} catch (Exception e) {
			fail(e.getMessage());
		}
		assertEquals("Numero de elementos erróneos", 0, gc.numeroCompras());
	}

	@Test
	public void testNumeroCompras() {
		gc.addCompra(new Compra(1, new Date(), 1.00));
		assertEquals("Numero de elementos erróneos", 1, gc.numeroCompras());
	}

}// fin class GestorComprasTest
