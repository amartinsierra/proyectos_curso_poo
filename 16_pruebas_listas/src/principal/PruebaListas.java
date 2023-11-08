package principal;

import java.util.ArrayList;

public class PruebaListas {

	public static void main(String[] args) {
		ArrayList<Integer> edades;  //lista de Integer
		ArrayList<String> nombres; //lista de Cadenas
		ArrayList cualquiera; //lista que puede mezclar objetos
		
		edades=new ArrayList<>(); //lista vacía
		nombres=new ArrayList<>(); 
		cualquiera=new ArrayList();
		
		
		edades.add(25);//autoboxing convierte el int 25 en Integer
		edades.add(34);
		edades.add(1,44);//se coloca en la pos 1 y desplaza el que estaba en adelante
		
		edades.remove(0); //elimina el 25
		System.out.println(edades.get(0)); //44
		System.out.println(edades.size()); //2
		
		//recorrido
		for(int i=0;i<edades.size();i++) {
			System.out.println(edades.get(i));
		}
		for(Integer in:edades) {
			System.out.println(in);
		}
		
		
	}

}
