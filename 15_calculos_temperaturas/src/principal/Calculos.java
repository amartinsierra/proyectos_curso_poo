package principal;

public class Calculos {

	public static void main(String[] args) {
		//temperaturas obtenidas por un sensor:
		String temperaturas="15.2,23.7,31.5,26.9,11.6";
		//calcular temperatura media
		String[] temps=temperaturas.split(",");
		double media=0;
		for(String d:temps) {
			media=media+Double.parseDouble(d);
		}
		media=media/temps.length;
		System.out.println("La media es: "+media);
		

	}

}
