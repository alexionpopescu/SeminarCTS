package ro.ase.cts.decoratormultiplu;

public class DecoratorSustinereEchipa extends DecoratorAbstract{
	public DecoratorSustinereEchipa(OperatorBilet bilet) {
		super(bilet);
	}
	@Override
	public void rezervaBilet() {
		super.rezervaBilet();
		System.out.println("Craciun fericit");
	}
}
