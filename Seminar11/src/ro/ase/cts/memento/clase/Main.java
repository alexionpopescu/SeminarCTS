package ro.ase.cts.memento.clase;

public class Main {

	public static void main(String[] args) {
		Originator meci=new Originator(100,"Borussia Mochengladbach","Wolverhampton Wanderers",20);
		Memento memento=meci.creareMemento();
		ManagerMeci managerMeci=new ManagerMeci();
		managerMeci.adaugaMemento(memento);
		meci.setNrSpectatori(200);
		meci.setNumeEchipaGazda("FCU Craiova");
		meci.setNumeEchipaOaspeti("CFR");
		System.out.println(meci);
		meci.setMemento(managerMeci.getMemento(0));
		System.out.println(meci);
	}

}
