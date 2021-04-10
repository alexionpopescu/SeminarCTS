package ro.ase.cts.decoratormultiplu;

public class Bilet implements OperatorBilet{
	private String numeEchipaGazda;
	private String numeEchipaOaspete;
	public Bilet(String numeEchipaGazda, String numeEchipaOaspete) {
		super();
		this.numeEchipaGazda = numeEchipaGazda;
		this.numeEchipaOaspete = numeEchipaOaspete;
	}
	@Override
	public void rezervaBilet() {
		// TODO Auto-generated method stub
		System.out.println(numeEchipaGazda+" vs "+numeEchipaOaspete);
	}
	@Override
	public String getNumeEchipaGazda() {
		// TODO Auto-generated method stub
		return numeEchipaGazda;
	}
	@Override
	public String getNumeEchipaOaspete() {
		// TODO Auto-generated method stub
		return numeEchipaOaspete;
	}
	
}
