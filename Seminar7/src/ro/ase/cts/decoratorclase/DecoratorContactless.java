package ro.ase.cts.decoratorclase;

public class DecoratorContactless extends DecoratorAbstract{

	public DecoratorContactless(CardAbstract cardAbstract) {
		super(cardAbstract);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void platesteContactless() {
		// TODO Auto-generated method stub
		System.out.println(((Card)super.getCardAbstract()).getTitular()+" plateste contactless");
	}

}
