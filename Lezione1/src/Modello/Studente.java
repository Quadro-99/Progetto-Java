package Modello;

import java.util.Scanner;

public class Studente {
public String nome, cognome; 
public int matricola; 



public Studente (String nome,String cognome, int matricola) {
	this.nome = nome; 
	this.cognome = cognome; 
	this.matricola = matricola;

}
public Studente () {
	
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
public int getMatricola() {
	return matricola;
}
public void setMatricola(int matricola) {
	this.matricola = matricola;


}
public static Studente read(Scanner sc) {
	if(Boolean.FALSE == sc.hasNextLine()) return null; 
	String nome = sc.nextLine();
	if(Boolean.FALSE == sc.hasNextLine()) return null;
	String cognome = sc.nextLine();
	if(Boolean.FALSE == sc.hasNextLine()) return null; 
	int matricola = Integer.parseInt(sc.nextLine()); 
	return new Studente(nome, cognome, matricola);
}
}

