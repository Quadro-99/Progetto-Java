package controller;

import java.io.File;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import Modello.Aula;

public class AulaController {
	private List<Aula> aulee;
	

	public AulaController () throws FileNotFoundException {

		File f = new File(getClass().getResource("/storage/aulee.dat").getFile());
		Scanner sc1 = new Scanner(f);
		this.aulee = new ArrayList<>();
		while (sc1.hasNextLine()) {
			Aula a = Aula.read(sc1);
			this.aulee.add(a);
		}
		Collections.sort(this.aulee, (a, b) -> a.compareTo(b));
	}
	
	
	public List<Aula> getAulee() {
		return aulee;
	}


	public Aula searchAulaByNomeAula(String name){
		return aulee.stream()
				.filter(a -> a.getNomeAula().equals(name))
				.collect(Collectors.toList()).get(0);
	}
	
	public List<Aula> searchAuleeByPostiGreatherThan(int posti){
		return aulee.stream()
				.filter(a -> a.getPosti() > posti).collect(Collectors.toList());
	}
	
	public List<Aula> searchAuleeByPostiNotRecognized(){
		return aulee.stream()
				.filter(a -> a.getPosti() == -1).collect(Collectors.toList());
	}
	
	public List<Aula> searchAuleeByPostiRecognized(){
		return aulee.stream()
				.filter(a -> a.getPosti() != -1)
				.collect(Collectors.toList());
	}
	
}
