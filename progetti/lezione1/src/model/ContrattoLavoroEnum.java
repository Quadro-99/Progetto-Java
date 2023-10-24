package model;

public class ContrattoLavoroEnum {
	
	public static enum ContrattoLavoro{
		PART_TIME,
		FULL_TIME
	}
	
	public String getNome(ContrattoLavoro contratto) {
		return contratto.name();
	}
	
	
	
}
