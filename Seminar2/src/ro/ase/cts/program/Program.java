package ro.ase.cts.program;

import java.io.FileNotFoundException;
import java.util.List;
import ro.ase.cts.reader.ReaderAngajati;
import ro.ase.cts.reader.ReaderAplicant;
import ro.ase.cts.reader.ReaderStudenti;
import ro.ase.cts.clase.Angajat;
import ro.ase.cts.clase.Aplicant;

public class Program {
	public static List<Aplicant> citireAplicanti(ReaderAplicant readerAplicant) throws FileNotFoundException{
		return readerAplicant.readAplicanti();
	}
	public static void main(String[] args) {
		List<Aplicant> listaAplicant;
		try {
			listaAplicant = citireAplicanti(new ReaderStudenti("studenti.txt"));
			for(Aplicant aplicant:listaAplicant) {
				System.out.println(aplicant.toString());
				System.out.print(aplicant.finantare());
			}
			} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
