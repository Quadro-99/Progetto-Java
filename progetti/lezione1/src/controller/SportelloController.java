package controller;

import model.Sportello;
import model.Studente;

public class SportelloController {

	public SportelloController() {}
	
	public boolean prenotaStudente(Studente studente, Sportello sportello) {
		return sportello.addStudente(studente);
	}
	
}
