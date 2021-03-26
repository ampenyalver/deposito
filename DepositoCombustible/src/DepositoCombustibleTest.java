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
		//assertFalse(dep.estaLleno());
		
		double amount=20; //mitad de capacidad
		depNivel = depNivel + amount;
		assertFalse(dep.estaLleno());//devuelve falso porque no esta lleno a mitad de su capacidad
	}

	@Test
	public void testFill() {
		//double cantidad=20;
		//dep.fill(cantidad);
		//assertEquals(30,dep.getDepositoNivel(),0.000001);
		//double cantidad2=-20;
		//dep.fill(cantidad2);
		//assertEquals(-10,dep.getDepositoNivel(),0.000001);
		  double cantidad3=40;
		  dep.fill(cantidad3);
		  assertEquals(50,dep.getDepositoNivel(),0.000001);
	    //depNivel=dep.getDepositoNivel() + cantidad;
		
		
		//assertEquals(30,dep.getDepositoNivel(),0.000001);
	}
	
	@Test
	public void testConsumir() {
		//double gasto=10;
		double gasto2=-10;
		double gasto3=30;
		//depNivel = depNivel - gasto;
		//dep.consumir(gasto);
		//assertEquals(0,dep.getDepositoNivel(),0.000001);
		//dep.consumir(gasto2);
		//assertEquals(20,dep.getDepositoNivel(),0.000001);
		dep.consumir(gasto3);
		assertEquals(-20,dep.getDepositoNivel(),0.000001);
	}

}
