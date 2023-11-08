package principal;

public class Test {

	public static void main(String[] args) {
		//dada una nota obtenida en una variable, indicar el resultado:
		//1-4: suspenso
		//5-6: Aprobado
		//7-8: Notable
		//9-10: Sobresaliente
		int nota=7;
		switch(nota) {
				
		case 1,2,3,4://solo desde Java 17
			System.out.println("Suspenso");
			break;
		case 5:			
		case 6:
			System.out.println("Aprobado");
			break;
		case 7:
		case 8:
			System.out.println("Notable");
			break;
		case 9:
		case 10:
			System.out.println("Sobresaliente");
			break;
		case '@':
		}

	}

}
