package ro.ase.cts.prototype.clase;

public class Bilet implements AbstractPrototype{
	private String Echipa1;
	private String Echipa2;
	private String data;
	
	public Bilet() {
		super();
	}

	public Bilet(String echipa1, String echipa2, String data) {
		super();
		Echipa1 = echipa1;
		Echipa2 = echipa2;
		this.data = data;
	}
	
	public String getEchipa1() {
		return Echipa1;
	}

	public void setEchipa1(String echipa1) {
		Echipa1 = echipa1;
	}

	public String getEchipa2() {
		return Echipa2;
	}

	public void setEchipa2(String echipa2) {
		Echipa2 = echipa2;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Bilet [Echipa1=");
		builder.append(Echipa1);
		builder.append(", Echipa2=");
		builder.append(Echipa2);
		builder.append(", data=");
		builder.append(data);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public AbstractPrototype copiaza() {
		Bilet copie=new Bilet();
		copie.data=this.data;
		copie.Echipa1=this.Echipa1;
		copie.Echipa2=this.Echipa2;
		return copie;
	}

}
