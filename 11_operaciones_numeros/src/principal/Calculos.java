package principal;





import java.util.Scanner;

import operaciones.Calculadora;

public class Calculos {

	public static void main(String[] args) {
		//lectura de datos del teclado
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce un número:");
		int x=sc.nextInt();
		System.out.println("Introduce otro número:");
		int y=sc.nextInt();
		//crear una instancia de la clase
		Calculadora cal=new Calculadora(x,y);
		//cal.establecerA(x);
		//cal.establecerB(y);
		System.out.println("La suma es: "+cal.suma());
		System.out.println("La multiplicación es: "+cal.multiplica());
		System.out.println("La división es: "+cal.dividir());
		
		/*****factorial***/
		System.out.println("Número para el factorial:");
		int n=sc.nextInt();
		System.out.println("El factorial de "+n+" es:"+Calculadora.factorial(n));
		
		
		
		sc.close();
	}

}
