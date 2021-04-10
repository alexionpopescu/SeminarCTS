package ro.ase.cts.decoratormultiplu;

public class Main {

	public static void main(String[] args) {
		Bilet bilet=new Bilet("Borussia Mochengladbach","Wolverhampton Wanderers");
		bilet.rezervaBilet();
		DecoratorAbstract meciInGermania=new DecoratorSustinereEchipa(bilet);
		meciInGermania.rezervaBilet();
		DecoratorAbstract meciDeCraciun=new DecoratorUrareCraciun(bilet);
		DecoratorAbstract meciInGermaniaDeCraciun=new DecoratorSustinereEchipa(meciDeCraciun);
		meciInGermaniaDeCraciun.rezervaBilet();
	}

}
