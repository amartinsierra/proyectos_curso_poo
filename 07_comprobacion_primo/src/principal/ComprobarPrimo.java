package principal;

public class ComprobarPrimo {

	public static void main(String[] args) {
		int numero=27;
		//Indica si el número es o no primo:
		boolean primo=true;
		for(int i=2;i<numero;i++) {
			if(numero%i==0) {
				primo=false;
			}
		}
		if(primo) {
			System.out.println("Número "+numero+" es primo");
		}else {
			System.out.println("Número "+numero+" no es primo");
		}

	}

}
