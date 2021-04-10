package ro.ase.cts.decoratorclase;

public class Card implements CardAbstract{
	private String titular;
	private String numarCard;
	public Card(String titular, String numarCard) {
		super();
		this.titular = titular;
		this.numarCard = numarCard;
	}
	@Override
	public void platesteOnline() {
		System.out.println(this.titular+" a realizat o plata online");
		
	}
	@Override
	public void platestePOS() {
		System.out.println(this.titular+" a realizat o plata la POS");
	}
	public String getTitular() {
		return titular;
	}
	public String getNumarCard() {
		return numarCard;
	}
	
}
