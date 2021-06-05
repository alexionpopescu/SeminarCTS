package ro.ase.cts.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ro.ase.cts.clase.Grupa;
import ro.ase.cts.clase.Student;

public class TestGetPromovabilitateGrupa {
	private Grupa grupa;
	@Before
	public void setUp() {
		grupa=new Grupa(1045);
		for(int i=0;i<35;i++) {
			Student student=new Student("Gigel");
			student.adaugaNota(8);
			student.adaugaNota(8);
			grupa.adaugaStudent(student);
		}
	}
	@Test
	public void testRight() {
		Grupa grupa=new Grupa(1085);
		for(int i=0;i<3;i++) {
			Student student=new Student("Gigel");
			student.adaugaNota(4);
			student.adaugaNota(5);
			grupa.adaugaStudent(student);
		}
		for(int i=0;i<7;i++) {
			Student student=new Student("Gigel");
			student.adaugaNota(9);
			student.adaugaNota(5);
			grupa.adaugaStudent(student);
		}
		assertEquals(0.7, grupa.getPromovabilitate(),0.01);
	}
	@Test
	public void testGetPromovabilitatelowerBound() {
		Grupa grupa=new Grupa(1085);
		for(int i=0;i<6;i++) {
			Student student=new Student("Gigel");
			student.adaugaNota(3);
			student.adaugaNota(8);
			grupa.adaugaStudent(student);
		}
		assertEquals(0, grupa.getPromovabilitate(),0.01);
	}
	@Test
	public void testGetPromovabilitateupperBound() {
		Grupa grupa=new Grupa(1085);
		for(int i=0;i<6;i++) {
			Student student=new Student("Gigel");
			student.adaugaNota(7);
			student.adaugaNota(8);
			grupa.adaugaStudent(student);
		}
		assertEquals(1, grupa.getPromovabilitate(),0.01);
	}
	@Test(expected=IndexOutOfBoundsException.class)
	public void testError() {
		Grupa grupa=new Grupa(1011);
		grupa.getPromovabilitate();
	}
	@Test(timeout=500)
	public void testPerformanceTimp() {
		grupa.getPromovabilitate();
	}
}
