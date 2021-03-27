package ro.ase.cts.simplefactory;

public class Main {

	public static void main(String[] args) {
		Factory factory=new Factory();
		Jucator portar=factory.getJucator(TipJucator.PORTAR, "Alisson", 27);
		Jucator fundas=factory.getJucator(TipJucator.FUNDAS,"van Dijk", 28);
		System.out.println(portar.toString());
		System.out.println(fundas.toString());
		FactorySingleton factorySingleton=FactorySingleton.getInstance();
		Jucator portar1=factorySingleton.getJucator(TipJucator.PORTAR, "Alisson", 27);
		Jucator fundas1=factorySingleton.getJucator(TipJucator.FUNDAS,"van Dijk", 28);
		System.out.println(portar1.toString());
		System.out.println(fundas1.toString());
	}

}
