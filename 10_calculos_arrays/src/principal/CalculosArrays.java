package principal;

public class CalculosArrays {

	public static void main(String[] args) {
		double[] notas= {5.6,7.8,4.2,9.0,8.1,2.6};
		//Nota media, total de aprobados, nota más alta
		double media=0,max=notas[0];
		int aprobados=0;
		for(double nota:notas) {
			media+=nota;
			if(nota>max) {
				max=nota;
			}
			if(nota>=5) {
				aprobados++;
			}
		}
		media/=notas.length;
		System.out.println("Media: "+media);
		System.out.println("Aprobados: "+aprobados);	
		System.out.println("Máxima: "+max);	
		

	}

}
