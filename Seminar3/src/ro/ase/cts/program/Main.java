package ro.ase.cts.program;

import ro.ase.cts.singletonlazy.AsigurareMedicala;
import ro.ase.cts.singletonlazy.Palat;

public class Main {

	public static void main(String[] args) {
		AsigurareMedicala asigurareMedicala=AsigurareMedicala.getInstance(1,"Gica",3);
		AsigurareMedicala asigurareMedicala1=AsigurareMedicala.getInstance(2,"Gigel",4);
		asigurareMedicala.setId(1);
		asigurareMedicala1.setContributie(3.3f);
		System.out.println(asigurareMedicala);
		System.out.println(asigurareMedicala1);
		Palat palat1=Palat.getInstance("George", 150.5f, 100);
		Palat palat2=Palat.getInstance("Carol", 250.5f, 200);
		
		
		System.out.println(palat1.toString());
		System.out.println(palat2.toString());
		
		palat1.setNumarCamere(300);
		palat2.setInaltime(250.4f);
		
		System.out.println(palat1.toString());
		System.out.println(palat2.toString());
		
	}

}
