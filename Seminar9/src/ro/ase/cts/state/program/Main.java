package ro.ase.cts.state.program;

import ro.ase.cts.state.clase.Libera;
import ro.ase.cts.state.clase.Masa;
import ro.ase.cts.state.clase.Ocupata;
import ro.ase.cts.state.clase.Rezervata;

public class Main {

	public static void main(String[] args) {
		Masa masa1=new Masa(1);
		masa1.rezervaMasa("Cristina");
		masa1.rezervaMasa("Alexandra");
		masa1.elibereazaMasa("Cristina");
		
		
		System.out.println();
		Masa masa2=new Masa(2);
		Rezervata rezervata=new Rezervata();
		Ocupata ocupata=new Ocupata();
		Libera libera=new Libera();
		masa2.elibereazaMasa("Maria");
		
		libera.modificaStare(masa2);
		rezervata.modificaStare(masa2);
		ocupata.modificaStare(masa2);
		
	}

}