package ro.ase.cts.observer.clase;

public class Main {

	public static void main(String[] args) {
		ManagerSala managerSala=new ManagerSala("Sala Sporturilor");
		ClientAbonat clientAbonat1=new ClientAbonat("Alex");
		ClientAbonat clientAbonat2=new ClientAbonat("Gica");
		ClientAbonat clientAbonat3=new ClientAbonat("Gigel");
		managerSala.aboneaza(clientAbonat1);
		managerSala.aboneaza(clientAbonat2);
		managerSala.aboneaza(clientAbonat3);
		managerSala.anuntaMeci("fotbal");
		managerSala.dezaboneaza(clientAbonat3);
		managerSala.anuntaMeci("volei");
	}

}
