package ro.ase.cts.composite.clase;

import java.util.ArrayList;
import java.util.List;

public class Sectiune extends ComponentaMeniu{
	private List<ComponentaMeniu> componente;
	public Sectiune(String nume) {
		super(nume);
		this.componente=new ArrayList<>();
	}

	@Override
	public void afisareDesc() {
		System.out.println("Sectiune: "+this.getNume());
		for(ComponentaMeniu componenta:this.componente) {
			componenta.afisareDesc();
		}
	}

	@Override
	public ComponentaMeniu getComponenta(int index) throws Exception {
		if(index<componente.size() && index>=0)
			return componente.get(index);
		throw new IndexOutOfBoundsException();
	}

	@Override
	public void adaugaComponenta(ComponentaMeniu componenta) {
		componente.add(componenta);
	}

	@Override
	public void stergeComponenta(ComponentaMeniu componenta) {
		componente.remove(componenta);
	}
	
}
