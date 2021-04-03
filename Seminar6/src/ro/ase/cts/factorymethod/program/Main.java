package ro.ase.cts.factorymethod.program;

import ro.ase.cts.factorymethod.AbstractFactory;
import ro.ase.cts.factorymethod.FactoryAtacant;
import ro.ase.cts.factorymethod.FactoryFundas;
import ro.ase.cts.factorymethod.FactoryMijlocas;
import ro.ase.cts.factorymethod.FactoryPortar;
import ro.ase.cts.factorymethod.Jucator;

public class Main {
	private static void afisInfoJucator(AbstractFactory abstractFactory,String nume,int meciuriJucate) {
		Jucator jucator=abstractFactory.getJucator(nume, meciuriJucate);
		System.out.println(jucator.toString());
	}
	public static void main(String[] args) {
		afisInfoJucator(new FactoryAtacant(),"Lewandowski",300);
		afisInfoJucator(new FactoryPortar(),"Neuer",400);
		afisInfoJucator(new FactoryFundas(),"Konate",100);
		afisInfoJucator(new FactoryMijlocas(),"Kimmich",250);
	}

}
