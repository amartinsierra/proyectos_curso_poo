package principal;

import java.util.Scanner;

public class ContadorVocales {

	public static void main(String[] args) {
		// Leer un texto e indicar cuantas vocales tiene
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce texto:");
		String texto=sc.nextLine();
		texto=texto.toLowerCase();
		int vocales=0;
		for(int i=0;i<texto.length();i++) {
			char letra=texto.charAt(i);
			switch(letra) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'á':
				vocales++;
			}
		}
		System.out.println("Total de vocales: "+vocales);

		
	}

}
