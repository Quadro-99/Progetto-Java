package model;

import java.util.ArrayList;
import java.util.List;

import model.SportelloEnum.TipoSportello;

public class Sportello {
	
	private static final int LIMITEPRENOTAZIONI = 10;
	private int NUMEROPRENOTAZIONI = 0;
	
	public Sportello() {
		this.studentiPrenotati = new ArrayList<>();
	}
	
	public Sportello(boolean aperto, boolean libero, Segretario segretario, TipoSportello tipoSportello, String numero) {
		super();
		this.aperto = aperto;
		this.libero = libero;
		this.segretario = segretario;
		this.tipoSportello = tipoSportello;
		this.setNumero(numero);
		this.studentiPrenotati = new ArrayList<>();
	}
	
	public boolean isAperto() {
		return aperto;
	}
	public void setAperto(boolean aperto) {
		this.aperto = aperto;
	}
	public boolean isLibero() {
		return libero;
	}
	public void setLibero(boolean libero) {
		this.libero = libero;
	}
	public Segretario getSegretario() {
		return segretario;
	}
	public void setSegretario(Segretario segretario) {
		this.segretario = segretario;
	}
	public TipoSportello getTipoSportello() {
		return tipoSportello;
	}
	public void setTipoSportello(TipoSportello tipoSportello) {
		this.tipoSportello = tipoSportello;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}

	public List<Studente> getStudentiPrenotati() {
		return studentiPrenotati;
	}

	public void setStudentiPrenotati(List<Studente> studentiPrenotati) {
		this.studentiPrenotati = studentiPrenotati;
	}
	public boolean addStudente(Studente studente) {
		if(studente != null && this.NUMEROPRENOTAZIONI < LIMITEPRENOTAZIONI) {
			this.NUMEROPRENOTAZIONI++;
			return this.studentiPrenotati.add(studente);
		}
		return false;
	}

	private String numero;
	private boolean aperto, libero;
	private Segretario segretario;
	private TipoSportello tipoSportello;
	private List<Studente> studentiPrenotati;
}