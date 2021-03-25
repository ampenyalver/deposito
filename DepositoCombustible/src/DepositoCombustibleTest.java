import static org.junit.Assert.*;

import org.junit.Test;

public class DepositoCombustibleTest {
	private double depMax;
    private double depNivel;
    DepositoCombustible dep=new DepositoCombustible(40,10);

	@Test
	public void testGetDepositoNivel() {
		assertEquals(10,dep.getDepositoNivel(),0.000001);
	
	}

	@Test
	public void testgetDepositoMax() {
		
		assertEquals(40,dep.getDepositoMax(), 0.000001);
		
	}

	@Test
	public void testEstaVacio() {
		//assertTrue(dep.estaVacio());
		assertFalse(dep.estaVacio());
	}

	@Test
	public void testEstaLleno() {
		//assertTrue(dep.estaLleno());
		assertFalse(dep.estaLleno());
	}

	@Test
	public void testFill() {
		double cantidad=20;
		dep.fill(cantidad);
		//depNivel=dep.getDepositoNivel() + cantidad;
		assertEquals(30,dep.getDepositoNivel(),0.000001);
	}
	
	@Test
	public void testConsumir() {
		double gasto=10;
		dep.consumir(gasto);
		//depNivel = depNivel - gasto;
		assertEquals(0,dep.getDepositoNivel(),0.000001);
	}

}
