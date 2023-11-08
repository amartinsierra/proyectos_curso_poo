package service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class ManipulacionesService {
	//realiza un método que a partir de una lista de números
	//devuelva la suma de todos ellos
	
	public int suma(List<Integer> lista) {
		int suma=0;
		for(int i=0;i<lista.size();i++) {
			suma+=lista.get(i);
		}
		return suma;
	}
	
	//realiza un método que reciba una lista y un conjunto de números
	//nos devolverá una lista con los números presentes en ambas colecciones
	
	public List<Integer> comunes(List<Integer> lista, Set<Integer> conjunto){
		List<Integer> resultado=new ArrayList<>();
		for(Integer n:lista) {
			//si está contenido en conjunto
			if(conjunto.contains(n)) {
				resultado.add(n);
			}
		}
		return resultado;
	}
	
}
