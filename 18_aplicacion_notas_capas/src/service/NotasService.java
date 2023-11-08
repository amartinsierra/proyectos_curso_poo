package service;

import java.util.ArrayList;

public class NotasService {
	private ArrayList<Double> notas=new ArrayList<Double>();
	private int maximoNotas;
	public NotasService(int maximoNotas) {
		this.maximoNotas=maximoNotas;
	}
	public NotasService() {//si no se da valor al máximo, se entiende que no hay límite
		
	}
	//métodos
	public boolean guardarNota(double nota) {
		if(notas.size()<maximoNotas||maximoNotas==0) {//hay sitio y guardamos
			notas.add(nota);
			return true;
		}
		return false;
	}
	
	//media
	public double media() {
		double media=0;
		//si no hay notas no procesamos
		if(notas.size()==0) {
			return 0;
		}
		for(Double n:notas) {
			media+=n;
		}
		return media/notas.size();
	}
	public int aprobados() {
		int aprobados=0;
		for(Double n:notas) {
			if(n>=5) {
				aprobados++;
			}
		}
		return aprobados;
	}
	
	public ArrayList<Double> notas() {
		return notas;
	}
}
