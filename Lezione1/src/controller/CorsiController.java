package controller;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Modello.*;

public class CorsiController {
	
	private List<Studente> studenti;
	private List<Corso> corsi; 
	private List<Professore> professori; 
	
	public CorsiController () throws FileNotFoundException {
		
		File f = new File(getClass().getResource("/storage/professori.dat").getFile());
		File f1 = new File(getClass().getResource("/storage/studenti.dat").getFile());
		Scanner sc1 = new Scanner(f);
		this.professori = new ArrayList<>();
		while (sc1.hasNextLine()) {
			Professore p = Professore.read(sc1);
			this.professori.add(p);
		}
		sc1 = new Scanner(f1);
		this.studenti = new ArrayList<>();
		while (sc1.hasNextLine()) {
			Studente s = Studente.read(sc1);
			this.studenti.add(s);
		}
	}

	public List<Corso> getCorsiByName(String name){
		List<Corso> trovati = new ArrayList<>();
		for(Corso c : corsi) {
			if(c.getNomeCorso().equalsIgnoreCase(name)) {
				trovati.add(c);
			}
		}
		return trovati;
	}

	public List<Corso> getCorsi() {
		return corsi;
	}

	public void setCorsi(List<Corso> corsi) {
		this.corsi = corsi;
	}

	public List<Professore> getProfessori() {
		return professori;
	}

	public void setProfessori(List<Professore> professori) {
		this.professori = professori;
	}

	public List<Studente> getStudenti() {
		return studenti;
	}

	public void setStudenti(List<Studente> studenti) {
		this.studenti = studenti;
	}
	
}

