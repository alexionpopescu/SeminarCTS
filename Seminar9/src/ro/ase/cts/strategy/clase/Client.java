package ro.ase.cts.strategy.clase;

public class Client {
	private String nume;
	private IModPlata iModPlata;
	
	public Client(String nume, IModPlata iModPlata) {
		super();
		this.nume = nume;
		this.iModPlata = iModPlata;
	}
	public void setiModPlata(IModPlata iModPlata) {
		this.iModPlata = iModPlata;
	}
	public void platesteNota(int suma) {
		System.out.println(nume+ " are de platit ");
		iModPlata.plateste(suma);
	}
}
