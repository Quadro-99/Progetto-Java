package Modello;

import java.util.Scanner;

public class Aula implements Comparable<Aula>{
	
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

public static Aula read(Scanner sc) {
	String nomeAula = null;
	int posti = 0;
	if (Boolean.TRUE == sc.hasNextLine()) nomeAula = sc.nextLine();
	if (Boolean.TRUE == sc.hasNextLine()) {
		try {
			posti = Integer.parseInt(sc.nextLine());
		}catch(NumberFormatException e) {
			System.out.println("Aula " + nomeAula + " posti not recognized.");
			posti = -1;
		}
	}
	return new Aula(nomeAula, posti);
}


@Override
public int compareTo(Aula o) {
	if(Integer.parseInt("" + nomeAula.charAt(1)) > Integer.parseInt("" + o.getNomeAula().charAt(1))) return 1;
	if(Integer.parseInt("" + nomeAula.charAt(1)) < Integer.parseInt("" + o.getNomeAula().charAt(1))) return -1;
	if(Integer.parseInt("" + nomeAula.charAt(2)) > Integer.parseInt("" + o.getNomeAula().charAt(2))) return 1;
	if(Integer.parseInt("" + nomeAula.charAt(2)) < Integer.parseInt("" + o.getNomeAula().charAt(2))) return -1;
	return 0;
}

}
