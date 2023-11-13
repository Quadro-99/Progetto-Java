package tester;
import java.io.FileNotFoundException;
import java.util.List;

import Modello.Aula;
import controller.AulaController;
import controller.CorsiController;

public class SegreteriaTest {

	public static void main(String[] args) throws FileNotFoundException {
		
		AulaController ac = new AulaController();
		
		List<Aula> auleeSenzaPosti = ac.searchAuleeByPostiNotRecognized();
		List<Aula> auleeConPosti = ac.searchAuleeByPostiRecognized();
		
		System.out.println("AULEE UNIVERSITA'\n");
		
		System.out.println("TUTTE LE AULEE\n");
		ac.getAulee().forEach(a -> System.out.println(a.getNomeAula() + " " + a.getPosti()));
		
		System.out.println("\n\nAULEE SENZA POSTI: \n");
		auleeSenzaPosti.forEach(a -> System.out.println(a.getNomeAula() + " " + a.getPosti()));
		
		
		System.out.println("\n\nAULEE CON POSTI: \n");
		auleeConPosti.forEach(a -> System.out.println(a.getNomeAula() + " " + a.getPosti()));
		
		
		
		
		//CorsiController cc = new CorsiController();
		//System.out.println(cc.getProfessori().get(0).getNome());
		//System.out.println(cc.getStudenti().get(0).getMatricola());
		
	}

}
