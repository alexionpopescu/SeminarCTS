package ro.ase.cts.test;

import static org.junit.Assert.*;

import org.junit.Test;

import ro.ase.cts.clase.Grupa;

public class TesteConstructorGrupa {

	@Test
	public void testRight() {
		Grupa grupa=new Grupa(1085);
		assertEquals(1085, grupa.getNrGrupa());
	}
	@Test
	public void testLowerBound() {
		Grupa grupa=new Grupa(1000);
		assertEquals(1000, grupa.getNrGrupa());
	}
	@Test 
	public void testUpperBound() {
		Grupa grupa=new Grupa(1100);
		assertEquals(1100, grupa.getNrGrupa());
	}
	@Test(expected=IllegalArgumentException.class)
	public void testErrorLowerBound() {
		Grupa grupa=new Grupa(700);
	}
	@Test(expected=IllegalArgumentException.class)
	public void testErrorUpperBound() {
		Grupa grupa=new Grupa(1700);
	}
	@Test(timeout=500)
	public void tesPerformance() {
		Grupa grupa=new Grupa(1085);
	}
	@Test
	public void testExistance() {
		Grupa grupa=new Grupa(1085);
		assertNotNull(grupa.getStudenti());
	}
}
