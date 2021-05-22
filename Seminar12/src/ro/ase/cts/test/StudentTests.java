package ro.ase.cts.test;

import static org.junit.Assert.*;

import org.junit.Test;

import ro.ase.cts.clase.Student;

public class StudentTests {

	@Test
	public void testCorectitudineContstructorCuParametru() {
		String nume="Gigel";
		Student student=new Student(nume);
		assertEquals(nume,student.getNume());
	}
	@Test
	public void testInitializareListaInConstructor() {
		Student student=new Student("Gigel");
		assertNotNull(student.getNote());
	}
	@Test
	public void testCorectitudineConstructorDefault() {
		Student student=new Student();
		assertNotNull("Numele nu a fost initializat",student.getNume());
		assertNotNull("Lista nu a fost initializata",student.getNote());
	}
	@Test
	public void testMetodaAdaugareInLista() {
		Student student=new Student();
		student.adaugaNota(10);
		assertEquals(10, student.getNota(0));
	}
	@Test
	public void testDimensiuneLista() {
		Student student=new Student();
		student.adaugaNota(10);
		student.adaugaNota(9);
		assertEquals(2, student.getNote().size());
	}
	@Test
	public void testCalculeazaMedie() {
		Student student=new Student();
		student.adaugaNota(8);
		student.adaugaNota(6);
		assertEquals(7f, student.calculeazaMedie(),0.1);
	}
	@Test
	public void testAreRestanta() {
		Student student=new Student();
		student.adaugaNota(4);
		student.adaugaNota(7);
		assertTrue(student.areRestante());
	}
	@Test
	public void testGetNotaIndexInvalid() {
		Student student=new Student();
		student.adaugaNota(7);
		try {
			int nota=student.getNota(-1);
			fail("Nu trebuia sa ajunga aici. Metoda nu arunca exceptie");
		}catch(IndexOutOfBoundsException e) {
			
		}
		catch(Exception ex) {
			fail("Tipul exceptiei aruncate nu este corect");
		}
	}
	@Test(expected=IndexOutOfBoundsException.class) 
	public void testGetNotaIndexInvalidJunit4() {
		Student student=new Student();
		student.adaugaNota(4);
		int nota=student.getNota(-1);
		
	}
}
