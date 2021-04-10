package ro.ase.cts.decoratormultiplu;

public class DecoratorUrareCraciun extends DecoratorAbstract{
	public DecoratorUrareCraciun(OperatorBilet bilet) {
		super(bilet);
	}
	@Override
	public void rezervaBilet() {
		super.rezervaBilet();
		System.out.println("Craciun fericit");
	}
}
