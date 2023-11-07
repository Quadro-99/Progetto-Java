package Modello;

import java.util.List;



public class Corso {
	
	public enum CFU{
		SEI,
		NOVE,
		DODICI;
	}
	public enum FrequenzaCorso{
		DUE,
		TRE;
	}

	private static final int orePerCfu = 8; 
	private Professore docente;
	private String nomeCorso;
	private Aula aula;
	private Esame esame;
	private List<Studente> studenti; 
	private CFU cfuCorso; 
	private FrequenzaCorso frequenza; 
	private int oreTotali;
	
	public Corso() {
	}
	
	public Corso(Professore docente, String nomeCorso, Aula aula, Esame esame, List<Studente> studenti, CFU cfuCorso,
			FrequenzaCorso frequenza) {
		super();
		this.docente = docente;
		this.nomeCorso = nomeCorso;
		this.aula = aula;
		this.esame = esame;
		this.studenti = studenti;
		this.cfuCorso = cfuCorso;
		this.frequenza = frequenza;
		calcolaOreTotali();
	}

	public Professore getDocente() {
		return docente;
	}

	public void setDocente(Professore docente) {
		this.docente = docente;
	}

	public String getNomeCorso() {
		return nomeCorso;
	}

	public void setNomeCorso(String nomeCorso) {
		this.nomeCorso = nomeCorso;
	}

	public Aula getAula() {
		return aula;
	}

	public void setAula(Aula aula) {
		this.aula = aula;
	}

	public Esame getEsame() {
		return esame;
	}

	public void setEsame(Esame esame) {
		this.esame = esame;
	}

	public List<Studente> getStudenti() {
		return studenti;
	}

	public void setStudenti(List<Studente> studenti) {
		this.studenti = studenti;
	}

	public CFU getCfuCorso() {
		return cfuCorso;
	}

	public void setCfuCorso(CFU cfuCorso) {
		this.cfuCorso = cfuCorso;
		calcolaOreTotali();
	}

	public FrequenzaCorso getFrequenza() {
		return frequenza;
	}

	public void setFrequenza(FrequenzaCorso frequenza) {
		this.frequenza = frequenza;
	}

	public int getOreTotali() {
		return oreTotali;
	}

	public void setOreTotali(int oreTotali) {
		this.oreTotali = oreTotali;
	}

	private void calcolaOreTotali() {
		this.oreTotali = orePerCfu * getOreByEnum(this.cfuCorso);
	}
	private int getOreByEnum(CFU corso) {
		switch (corso) {
		case SEI:
			return 6;
		case NOVE:
			return 9;
		case DODICI:
			return 12;
		default: return 0; 
		}
	}

}
