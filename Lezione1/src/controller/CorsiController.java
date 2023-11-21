package controller;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import Modello.*;

public class CorsiController {
	

	private List<Corso> corsi; 

	private ProfessoriController pc; 
	private StudenteController sc; 
	private AulaController ac;
	
	public CorsiController (ProfessoriController pc, StudenteController sc,AulaController ac) throws FileNotFoundException {
		this.pc = pc;
		this.sc = sc;
		this.ac = ac; 
		
		File f = new File(getClass().getResource("/storage/corsi.dat").getFile());
		Scanner sc1 = new Scanner(f);
		this.corsi = new ArrayList<>();
		while (sc1.hasNextLine()) {
			if(Boolean.TRUE == sc1.hasNextLine()) {
				String nomeCorso = sc1.nextLine();
				String cfu = sc1.nextLine();
				String docente = sc1.nextLine();
				String aula = sc1.nextLine();
				String esame = sc1.nextLine();
				String frequenza = sc1.nextLine();
				sc1.nextLine();
				List<Integer> matricole = new ArrayList<>();
				boolean done = false; 
				while(!done) {
					String token = sc1.nextLine();
					if(token.equals("#")) done = true;
					else matricole.add(Integer.parseInt(token));
				}
				Professore p = this.pc.searchProfessoreBySurname(docente);
				Aula a = this.ac.searchAulaByNomeAula(aula);
				Esame e = new Esame();
				List<Studente> ls = this.sc.getStudentiByMatricola(matricole);
				Corso.CFU c = Corso.CFU.valueOf(cfu);
				Corso.FrequenzaCorso fc = Corso.FrequenzaCorso.valueOf(frequenza);
				Corso corso = new Corso(p, nomeCorso, a, e, ls, c, fc); 
				corsi.add(corso);
				
			}
			
			
		}
	}

	public List<Corso> getCorsiByName(String name){
		return corsi.stream().filter(c -> c.getNomeCorso().equals(name)).collect(Collectors.toList());
			
	}

	public List<Corso> getCorsi() {
		return corsi;
	}

	public void setCorsi(List<Corso> corsi) {
		this.corsi = corsi;
	}

	
	
}

