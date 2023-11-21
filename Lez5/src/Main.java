import java.util.*;


public class Main {

	public static void main(String[] args) {

		List<Professore> lista = new ArrayList<>();
		
		lista.add(new Professore("ABA", "BBEO"));
		lista.add(new Professore("MARIO", "ROSSI"));
		lista.add(new Professore("NON", "IO"));
		//Professore p = new Professore("MARIO", "ROSSI"); // MALLOC
		
		//System.out.println(p.hashCode());
		//System.out.println(lista.get(1).hashCode());
		
		System.out.println("PRIMA");
		lista.forEach(prof -> System.out.println(prof.getNome() + " " + prof.getCognome()));
		
		Professore p = searchProf("MARIO", "ROSSI", lista);
		
		if(p != null) {
			lista.remove(p);
		}
		
		System.out.println("\n\nDOPO");
		lista.forEach(prof -> System.out.println(prof.getNome() + " " + prof.getCognome()));
		
		// HASHCODE sha128 - sha1 - sha256 - sha....
		
	}
	
	static Professore searchProf(String nome, String cognome, List<Professore> list) {
		boolean done = false;
		int x = 0;
		while(!done) {
			if(list.get(x).cognome.equals(cognome) && list.get(x).getNome().equals(nome)) {
				return list.get(x);
			}
			x++;
		} 
		return null;
	}
	
	static class Professore{
		public Professore(String nome, String cognome) {
			this.nome = nome;
			this.cognome = cognome;
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



		private String nome;
		private String cognome;
	}

}
