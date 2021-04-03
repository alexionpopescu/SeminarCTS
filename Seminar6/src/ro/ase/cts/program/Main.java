package ro.ase.cts.program;

import ro.ase.cts.builder.Rezervare;
import ro.ase.cts.builder.RezervareBuilder;
import ro.ase.cts.builder.RezervareBuilderV2;

public class Main {

	public static void main(String[] args) {
		Rezervare rezervare=new Rezervare(1,false,false,false,true,"jazz");
		System.out.println(rezervare.toString());
		Rezervare rezervare1=new RezervareBuilder().setCod(10).setBauturaRacoritoare(true).setMuzicaAmbientala(true).build();
		System.out.println(rezervare1.toString());
		Rezervare rezervare2=new RezervareBuilder(12).setGenMuzica("pop").build();
		System.out.println(rezervare2.toString());
		RezervareBuilder builder=new RezervareBuilder();
		Rezervare r1;
		Rezervare r2;
		r1=builder.setCod(13).setGenMuzica("jazz").build();
		r2=builder.setCod(14).build();
		System.out.println(r1.toString());
		System.out.println(r2.toString());
		RezervareBuilderV2 builder1=new RezervareBuilderV2().setBauturaRacoritoare(true).setMancareInclusa(true);
		Rezervare rezervare3=builder1.setCod(5).build();
		Rezervare rezervare4=builder1.setCod(6).build();
		System.out.println(rezervare3.toString());
		System.out.println(rezervare4.toString());
	}

}
