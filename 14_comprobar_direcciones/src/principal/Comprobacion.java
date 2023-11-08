package principal;

public class Comprobacion {

	public static void main(String[] args) {
		String direcciones="una@gmail.com,dos.com,aaaa@gmail,wert@google.es,prt.es";
		//String correctas="";
		StringBuilder correctas=new StringBuilder("");
		//el programa nos debe indicar
		//cuantas de email son correctas
		//una dirección es correcta si contiene un @ y un .
		String dirs[] = direcciones.split(",");
		int contador = 0;
				
		//el programa nos debe indicar cuántas direcciones de e-mail son correctas
		//una direcciones correcta si contiene una @ y un .
		
		for (String dir:dirs) {
			if (dir.contains("@") && dir.contains(".")) {
				contador++;
				//correctas=correctas+dir+",";
				correctas.append(dir);
				correctas.append(",");
			}
		}
		correctas.delete(correctas.length()-1, correctas.length());
		System.out.println("Total direcciones correctas: " + contador);
		System.out.println("Esas direcciones son: " + correctas);
	}

}
