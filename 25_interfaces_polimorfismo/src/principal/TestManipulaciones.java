package principal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import service.ManipulacionesService;

public class TestManipulaciones {

	public static void main(String[] args) {
		ManipulacionesService service=new ManipulacionesService();
		//creamos cuatro tipos de listas
		ArrayList<Integer> lista1=new ArrayList<Integer>();
		lista1.add(2);lista1.add(10);lista1.add(5);
		Vector<Integer> lista2=new Vector<Integer>();
		lista2.add(3);lista2.add(11);lista2.add(20);
		LinkedList<Integer> lista3=new LinkedList<Integer>();
		lista3.add(7);lista3.add(4);
		List<Integer> lista4=Arrays.asList(3,11,25);
		
		System.out.println("Suma lista 1 "+service.suma(lista1));
		System.out.println("Suma lista 2 "+service.suma(lista2));
		System.out.println("Suma lista 3 "+service.suma(lista3));
		System.out.println("Suma lista 4 "+service.suma(lista4));
		
		
		HashSet<Integer> con=new HashSet<Integer>();
		con.add(23);con.add(5);con.add(11);con.add(4);con.add(10);
		
		List<Integer> comunes=service.comunes(lista1, con);
		for(Integer d:comunes) {
			System.out.println(d);
		}
		

	}

}
