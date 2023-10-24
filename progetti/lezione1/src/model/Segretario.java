package model;

import model.ContrattoLavoroEnum.ContrattoLavoro;

public class Segretario extends Impiegato {

	public Segretario() { }

	public Segretario(String nome, String cognome, double stipendio, ContrattoLavoro contratto, Sportello sportello) {
		super(nome, cognome, stipendio, contratto);
		this.sportello = sportello;
	}

	public Sportello getSportello() {
		return sportello;
	}


	public void setSportello(Sportello sportello) {
		this.sportello = sportello;
	}


	private Sportello sportello;
}
