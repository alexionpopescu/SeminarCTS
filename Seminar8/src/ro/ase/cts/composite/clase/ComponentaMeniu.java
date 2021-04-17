package ro.ase.cts.composite.clase;

public abstract class ComponentaMeniu {
	private String nume;
	public abstract void afisareDesc();
	public abstract ComponentaMeniu getComponenta(int index) throws Exception;
	public abstract void adaugaComponenta(ComponentaMeniu componenta);
	public abstract void stergeComponenta(ComponentaMeniu componenta);
	public ComponentaMeniu(String nume) {
		super();
		this.nume = nume;
	}
	public String getNume() {
		return nume;
	}
	
}
