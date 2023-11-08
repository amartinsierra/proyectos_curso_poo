package principal;

public class SumarNumeros {

	public static void main(String[] args) {
		//hasta que número tendremos que sumar, empezando por 1,
		//para conseguir que la suma sea igual o superor a 1000
		
		//1+2+3+4....
		int suma=0;
		int i=0;
		while (suma<1000) {
			i++;
			suma = suma + i;
			
		}
		System.out.println(i);

	}

}
