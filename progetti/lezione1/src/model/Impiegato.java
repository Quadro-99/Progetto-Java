package model;

import model.ContrattoLavoroEnum.ContrattoLavoro;

public class Impiegato {
	
	public Impiegato(String nome, String cognome, double stipendio, ContrattoLavoro contratto) {
		this.nome = nome;
		this.cognome = cognome;
		this.stipendio = stipendio;
		this.contratto = contratto;
	}
	
	public Impiegato() {}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public double getStipendio() {
		return stipendio;
	}
	
	public ContrattoLavoro getContratto() {
		return contratto;
	}
	
	public void setContratto(ContrattoLavoro contratto) {
		this.contratto = contratto;
	}

	private String nome, cognome;
	private double stipendio;
	private ContrattoLavoro contratto;
	
}
