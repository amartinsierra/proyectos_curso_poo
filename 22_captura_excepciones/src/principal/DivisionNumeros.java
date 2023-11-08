package principal;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionNumeros {

	public static void main(String[] args) {
		//solicita dos números y muestra el resultado de dividir
		//uno entre otro
		Scanner sc=new Scanner(System.in);
		int a,b,div;
		try {
			System.out.println("Introduce un número:");
			a=sc.nextInt();
			System.out.println("Introduce otro número(distinto de cero):");
			b=sc.nextInt();
			div=a/b;
			System.out.println("La división vale: "+div);
		}
		catch(InputMismatchException ex) {
			System.out.println("Error en la introdución de números");
		}
		catch(ArithmeticException ex) {
			System.out.println("La división entre 0 no es válida");
		}
	}

}
