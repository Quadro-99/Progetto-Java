package Modello;

public class Segretario extends Impiegato {
private String mansione;

public Segretario (String nome, String cognome, double stipendio, String mansione) {
this.nome = nome; 
this.cognome = cognome;
this.stipendio = stipendio;
this.mansione = mansione;
}
public Segretario() {

}
public String getMansione() {
	return mansione;
}
public void setMansione(String mansione) {
	this.setMansione(mansione);

}
}