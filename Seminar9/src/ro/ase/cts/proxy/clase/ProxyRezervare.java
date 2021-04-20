package ro.ase.cts.proxy.clase;

public class ProxyRezervare implements IOperatorRezervari{
	private OperatorRezervare rezervare;
	private int limita;
	
	public ProxyRezervare(OperatorRezervare rezervare, int limita) {
		super();
		this.rezervare = rezervare;
		this.limita = limita;
	}

	@Override
	public void rezerva(int numarPersoane) {
		if(numarPersoane>=limita) {
			rezervare.rezerva(numarPersoane);
		}
		else {
			System.out.println("Prea putine persoane!");
		}
	}
	
}
