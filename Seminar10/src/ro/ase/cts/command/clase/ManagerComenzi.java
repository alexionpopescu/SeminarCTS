package ro.ase.cts.command.clase;

import java.util.ArrayList;
import java.util.List;

public class ManagerComenzi {
	private List<ComandaAbstracta> listaComenzi;
	public ManagerComenzi() {
		super();
		this.listaComenzi=new ArrayList<ComandaAbstracta>();
	}
	public void invocaComanda(ComandaAbstracta comandaAbstracta) {
		listaComenzi.add(comandaAbstracta);
	}
	public void executaComanda() {
		if(!listaComenzi.isEmpty()) {
			listaComenzi.get(0).executa();
			listaComenzi.remove(0);
		}
	}
}
