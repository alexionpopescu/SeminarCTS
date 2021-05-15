package ro.ase.cts.memento.clase;

public class Memento {
	private int nrSpectatori;
	private String numeEchipaGazda;
	private String numeEchipaOaspeti;
	public Memento(int nrSpectatori, String numeEchipaGazda, String numeEchipaOaspeti) {
		super();
		this.nrSpectatori = nrSpectatori;
		this.numeEchipaGazda = numeEchipaGazda;
		this.numeEchipaOaspeti = numeEchipaOaspeti;
	}
	public int getNrSpectatori() {
		return nrSpectatori;
	}
	public void setNrSpectatori(int nrSpectatori) {
		this.nrSpectatori = nrSpectatori;
	}
	public String getNumeEchipaGazda() {
		return numeEchipaGazda;
	}
	public void setNumeEchipaGazda(String numeEchipaGazda) {
		this.numeEchipaGazda = numeEchipaGazda;
	}
	public String getNumeEchipaOaspeti() {
		return numeEchipaOaspeti;
	}
	public void setNumeEchipaOaspeti(String numeEchipaOaspeti) {
		this.numeEchipaOaspeti = numeEchipaOaspeti;
	}
	
}
