package ro.ase.cts.clase;

import java.util.Arrays;

public class Elev extends Aplicant{
	private int clasa;
	private String tutore;
	
	public int getClasa() {
		return clasa;
	}
	public void setClasa(int index) {
		this.clasa = index;
	}
	public String getTutore() {
		return tutore;
	}
	public void setTutore(String tutore) {
		this.tutore = tutore;
	}
	
	
	@Override
	public String toString() {
		final StringBuilder stringBuilder=new StringBuilder("Elev:");
		stringBuilder.append(super.toString());
		stringBuilder.append(", clasa=").append(clasa);
		stringBuilder.append(", tutore=").append(tutore);
		return stringBuilder.toString();
	}
	
	public Elev() {
		super();
	}
	
	public Elev(String nume, String prenume, int varsta, int punctaj,
			int nr_proiecte, String[] denumireProiect, int clasa, String tutore) {
		super(nume,prenume,varsta,punctaj,nr_proiecte,denumireProiect);
		this.clasa = clasa;
		this.tutore = tutore;
	}
	
	public String finantare() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.finantare());
		builder.append(Constante.SUMA_FINANTARE_ELEV);
		builder.append(" Euro/zi in proiect.");	
		System.out.println(builder.toString());
		return builder.toString();
	}
	
}
