package Modello;

public class Aula {
public String nomeAula;
public int posti;
 
public Aula(String nomeAula, int posti) {
	this.nomeAula = nomeAula;
	this.posti = posti; 
}
public Aula () {
	
}
public String getNomeAula() {
	return nomeAula;
}
public void setNomeAula(String nomeAula) {
	this.nomeAula = nomeAula;
}
public int getPosti() {
	return posti;
}
public void setPosti(int posti) {
	this.posti = posti;
}

}
