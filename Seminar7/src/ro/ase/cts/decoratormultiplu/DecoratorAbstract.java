package ro.ase.cts.decoratormultiplu;

public abstract class DecoratorAbstract implements OperatorBilet{
private OperatorBilet bilet;
	
	
	public DecoratorAbstract(OperatorBilet bilet) {
		super();
		this.bilet = bilet;
	}

	@Override
	public void rezervaBilet() {
		bilet.rezervaBilet();		
	}

	@Override
	public String getNumeEchipaGazda() {
		return bilet.getNumeEchipaGazda();
	}

	@Override
	public String getNumeEchipaOaspete() {
		return bilet.getNumeEchipaOaspete();
	}
	
}
