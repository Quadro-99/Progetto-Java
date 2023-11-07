package Modello;

import java.util.Date;

public class Esame {
public String nomeEsame;
public Date data; 
public int voto;

public Esame (String nomeEsame, int voto, Date data) {
this.nomeEsame = nomeEsame;
this.data = data;
this.voto = voto; 
}
public Esame () {
}
public String getNomeEsame() {
	return nomeEsame;
}
public void setNomeEsame(String nomeEsame) {
	this.nomeEsame = nomeEsame;
}
public Date getData() {
	return data;
}
public void setData(Date data) {
	this.data = data;
}
public int getVoto() {
	return voto;
}
public void setVoto(int voto) {
	this.voto = voto;
}
//public static double calcolaMedia(List<EsameUniversitario> esami) {
}
