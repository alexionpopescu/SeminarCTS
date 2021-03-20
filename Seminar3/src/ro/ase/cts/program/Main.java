package ro.ase.cts.program;

import ro.ase.cts.singletonlazy.AsigurareMedicala;

public class Main {

	public static void main(String[] args) {
		AsigurareMedicala asigurareMedicala=AsigurareMedicala.getInstance(1,"Gica",3);
		AsigurareMedicala asigurareMedicala1=AsigurareMedicala.getInstance(2,"Gigel",4);
		asigurareMedicala.setId(1);
		asigurareMedicala1.setContributie(3.3f);
		System.out.println(asigurareMedicala);
		System.out.println(asigurareMedicala1);
	
		
	}

}
