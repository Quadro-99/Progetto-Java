package Modello;

public class Impiegato {
public String nome, cognome; 
public double stipendio;

public Impiegato(String nome, String cognome, double stipendio) {
this.nome = nome; 
this.cognome = cognome;
this.stipendio = stipendio;
}
public Impiegato (){ 
}
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
}
