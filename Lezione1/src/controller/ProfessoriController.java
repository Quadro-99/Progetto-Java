package controller;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import Modello.*;

public class ProfessoriController {

	private List<Professore> professori; 
	//classe controller professori
	
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
		professori.removeIf(p -> p.getNome().equals(nome) && p.getCognome().equals(cognome));
	}
	
	public List<Professore> searchProfessoriByName(String nome, String cognome) {
		return professori.stream()
				.filter(p -> p.getNome().equals(nome) && p.getCognome().equals(cognome))
				.collect(Collectors.toList());
	}
	public Professore searchProfessoreBySurname(String cognome) {
		return professori.stream()
				.filter(p -> p.getCognome().equals(cognome))
				.collect(Collectors.toList()).get(0);
	}
	
	public List<Professore> searchProfessoreByContratto(TipoContratto tipocontratto){
		return professori.stream()
				.filter(p -> p.getContratto() == tipocontratto)
				.collect(Collectors.toList());
	}
	
}
