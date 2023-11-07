package Modello;

import java.util.Scanner;

public class Professore extends Impiegato { 
	private TipoContratto contratto;
	
	public Professore (String nome, String cognome, TipoContratto contratto, double stipendio) { 
		this.nome = nome;
		this.cognome = cognome; 
		this.contratto = contratto;
		this.stipendio = stipendio; 
	}
	public Professore() {
	}

	public TipoContratto getContratto() {
		return contratto;
	}
	public void setContratto(TipoContratto contratto) {
		this.contratto = contratto;
	} 
	public static Professore read (Scanner sc) {
		if (Boolean.FALSE == sc.hasNextLine()) return null;
		String nome = sc.nextLine();
		if (Boolean.FALSE == sc.hasNextLine()) return null;
		String cognome = sc.nextLine();
		if (Boolean.FALSE == sc.hasNextLine()) return null;
		TipoContratto contratto = TipoContratto.valueOf(sc.nextLine());
		if (Boolean.FALSE == sc.hasNextDouble()) return null;
		double stipendio = Double.parseDouble(sc.nextLine());
		return new Professore(nome, cognome, contratto, stipendio);
		

	}
	
}
