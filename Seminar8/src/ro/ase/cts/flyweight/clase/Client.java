package ro.ase.cts.flyweight.clase;

public class Client implements FlyweightAbstract{
	private String nume;
	private int nrTelefon;
	private String email;
	public Client(String nume, int nrTelefon, String email) {
		super();
		this.nume = nume;
		this.nrTelefon = nrTelefon;
		this.email = email;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Client [nume=");
		builder.append(nume);
		builder.append(", nrTelefon=");
		builder.append(nrTelefon);
		builder.append(", email=");
		builder.append(email);
		builder.append("]");
		return builder.toString();
	}
	@Override
	public void afisRezervare(Rezervare rezervare) {
		// TODO Auto-generated method stub
		System.out.println(rezervare.toString()+this.toString());
	}
	
}
