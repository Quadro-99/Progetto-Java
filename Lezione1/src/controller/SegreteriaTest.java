package controller;
import java.io.FileNotFoundException;
public class SegreteriaTest {

	public static void main(String[] args) throws FileNotFoundException {
		CorsiController cc = new CorsiController();
		System.out.println(cc.getProfessori().get(0).getNome());
		System.out.println(cc.getStudenti().get(0).getMatricola());
		
	}

}
