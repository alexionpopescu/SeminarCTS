package ro.ase.cts.prototype.program;

import ro.ase.cts.prototype.clase.AbstractPrototype;
import ro.ase.cts.prototype.clase.Bilet;
import ro.ase.cts.prototype.clase.ClientStadion;

public class Main {

	public static void main(String[] args) {
		AbstractPrototype abstractPrototype=new ClientStadion("Alex",22);
		AbstractPrototype abstractPrototype1=abstractPrototype.copiaza();
		ClientStadion clientStadion=(ClientStadion) abstractPrototype.copiaza();
		clientStadion.setDenumire("AltaDenumire");
		System.out.println(abstractPrototype.toString());
		System.out.println(abstractPrototype1.toString());
		System.out.println(clientStadion.toString());
		AbstractPrototype abstractPrototype2=new Bilet("Liverpool","Everton","20/4/2021");
		AbstractPrototype abstractPrototype3=abstractPrototype2.copiaza();
		System.out.println(abstractPrototype2.toString());
		System.out.println(abstractPrototype3.toString());
	}

}
