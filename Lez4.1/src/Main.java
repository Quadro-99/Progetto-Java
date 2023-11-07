import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		Map<Integer, Professore> tabella = new HashMap<Integer, Professore>();
		
		Professore p1 = new Professore("MARIO", "ROSSI");
		Professore p2 = new Professore("ALESSADNRO", "QUADRELLI");
		Professore p3 = new Professore("MARCO", "ZUZZU");
		Professore p4 = new Professore("ALBERT", "EINSTEIN");

		// put INSERIAMO get PRENDIAMO
		
		tabella.put(1, p1);
		tabella.put(2, p2);
		tabella.put(3, p3);
		tabella.put(4, p4);
		tabella.put(5, p1);
		
		System.out.println(tabella.get(1).nome);
		System.out.println(tabella.get(2).nome);
		System.out.println(tabella.get(3).nome);
		System.out.println(tabella.get(4).nome);
		System.out.println(tabella.get(5).nome);
		
		
		tabella.remove(4);
		
		System.out.println(tabella.get(1).nome);
		System.out.println(tabella.get(2).nome);
		System.out.println(tabella.get(3).nome);
		System.out.println(tabella.getOrDefault(4, p4).nome);
		System.out.println(tabella.get(5).nome);
		
	}
	
	
	
	
	
	static class Professore{
		
		
		
		public Professore(String nome, String cognome) {
			super();
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


		private String nome, cognome;
	}

}
