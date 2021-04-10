package ro.ase.cts.decorator.program;

import ro.ase.cts.decoratorclase.Card;
import ro.ase.cts.decoratorclase.DecoratorAbstract;
import ro.ase.cts.decoratorclase.DecoratorContactless;
import ro.ase.cts.decoratorclase.DecoratorContactlessTelefon;

public class Main {
	public static void main(String[] args) {
		Card card=new Card("Tommy","23432345");
		card.platesteOnline();
		card.platestePOS();
		DecoratorAbstract decoratorAbstract=new DecoratorContactless(card);
		decoratorAbstract.platesteContactless();
		decoratorAbstract.platesteOnline();
		decoratorAbstract.platestePOS();
		DecoratorAbstract decoratorAbstract1=new DecoratorContactlessTelefon(card);
		decoratorAbstract1.platesteContactless();
		decoratorAbstract1.platesteOnline();
		decoratorAbstract1.platestePOS();
		DecoratorAbstract decoratorAbstract2=new DecoratorContactless(decoratorAbstract1);
		
	}
}
