package ro.ase.cts.flyweight.program;

import ro.ase.cts.flyweight.clase.Client;
import ro.ase.cts.flyweight.clase.FabricaClienti;
import ro.ase.cts.flyweight.clase.Rezervare;

public class Main {
	public static void main(String[] args) {
		Rezervare rezervare=new Rezervare(100,3,19);
		Rezervare rezervare1=new Rezervare(111,4,20);
		Rezervare rezervare2=new Rezervare(122,5,30);
		FabricaClienti fabrica=new FabricaClienti();
		Client client=fabrica.getClient("client@email.com");
		client.afisRezervare(rezervare);
		fabrica.getClient("client1@email.com").afisRezervare(rezervare1);
		fabrica.getClient("client@email.com").afisRezervare(rezervare2);
	}
}
