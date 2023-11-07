package controller;
import java.util.List;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import Modello.*;



public class StudenteController {
	
	private List<Studente> studenti;
	
public StudenteController () throws FileNotFoundException {
		
		File f1 = new File(getClass().getResource("/storage/studenti.dat").getFile());
		Scanner sc1 = new Scanner(f1);
		this.studenti = new ArrayList<>();
		while (sc1.hasNextLine()) {
			Studente s = Studente.read(sc1);
			this.studenti.add(s);
		}
	}
	
	
		
	public void aggiungiStudente (Studente studente) {
		studenti.add(studente);
	}
	
	public void rimuoviStudente(Studente studente) {
        studenti.remove(studente);
    }
		
	public List<Studente> getStudentiByMatricola (int matricola){
			List<Studente> iscritti = new ArrayList<>();
			for (Studente s: studenti)
				if (s.getMatricola() == matricola) {
					iscritti.add(s);
				}
			return iscritti; 
		}
	

	public List<Studente> getStudenti() {
		return studenti;
	}

	public void setStudenti(List<Studente> studenti) {
		this.studenti = studenti;
	}
}
