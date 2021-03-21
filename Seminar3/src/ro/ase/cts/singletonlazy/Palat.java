package ro.ase.cts.singletonlazy;

public class Palat {

	private String numeRege;
	private float inaltime;
	private int numarCamere;
	
	private static Palat palat=null;

	
	private Palat(String numeRege, float inaltime, int numarCamere) {
		super();
		this.numeRege = numeRege;
		this.inaltime = inaltime;
		this.numarCamere = numarCamere;
	}


	public static synchronized Palat getInstance(String numeRege, float inaltime, int numarCamere) {
		if(palat==null) {
			palat=new Palat(numeRege, inaltime, numarCamere);
		}
		return palat;
	}
	
	
	public void setNumeRege(String numeRege) {
		this.numeRege = numeRege;
	}


	public void setInaltime(float inaltime) {
		this.inaltime = inaltime;
	}


	public void setNumarCamere(int numarCamere) {
		this.numarCamere = numarCamere;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Palat [numeRege=");
		builder.append(numeRege);
		builder.append(", inaltime=");
		builder.append(inaltime);
		builder.append(", numarCamere=");
		builder.append(numarCamere);
		builder.append("]");
		return builder.toString();
	}
}