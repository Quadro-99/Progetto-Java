package controller;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Modello.*;

public class ProfessoriController {

	private List<Professore> professori; 
	
	
	public ProfessoriController () throws FileNotFoundException {
		
		File f = new File(getClass().getResource("/storage/professori.dat").getFile());
		Scanner sc1 = new Scanner(f);
		this.professori = new ArrayList<>();
		while (sc1.hasNextLine()) {
			Professore p = Professore.read(sc1);
			this.professori.add(p);
		
}
	}


	public List<Professore> getProfessori() {
		return professori;
	}


	public void setProfessori(List<Professore> professori) {
		this.professori = professori;
	}
	
	public void aggiungiProfessore(Professore professore) {
		professori.add(professore);
	}
	public void rimuoviProfessore(String nome, String cognome) {
		for(int i=0; i<= professori.size(); i++)
			if (professori.get(i).getNome().equals(nome) 
					&& professori.get(i).getCognome().equals(cognome)) {
				professori.remove(i);
			}
	}
	public List<Professore> cercaProfessori(String nome, String cognome) {
		List<Professore> risultato = new ArrayList<>();
		for (Professore p: professori)
			if(p.getNome() == nome && p.getCognome() == cognome) {
				risultato.add(p);
			}
				return risultato;
	
	}
}
