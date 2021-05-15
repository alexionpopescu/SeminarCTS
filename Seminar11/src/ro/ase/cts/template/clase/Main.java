package ro.ase.cts.template.clase;

public class Main {

	public static void main(String[] args) {
		SpectatorAbstract spectator=new Spectator("Alex");
		SpectatorAbstract spectatorVIP=new SpectatorVIP("VIP","Loja 1");
		spectator.intrarePeStadion();
		spectatorVIP.intrarePeStadion();
	}

}
