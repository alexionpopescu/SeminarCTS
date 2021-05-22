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
}
