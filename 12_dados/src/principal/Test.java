package principal;

public class Test {

	public static void main(String[] args) {
		/*int num=(int)(Math.random()*6+1);
		System.out.println(num);*/
		//simular el lanzamiento del dado 100000 veces y mostrar
		//los porcentajes de cada cara
		final int tiradas=100_000;
		int[]caras=new int[6];
		for(int i=1;i<=tiradas;i++) {
			int num=(int)(Math.random()*6+1);
			caras[num-1]++;
		}
		//mostrar porcentajes
		for(int i=0;i<caras.length;i++) {
			System.out.println((i+1)+": "+caras[i]*100.0/tiradas+" %");
		}
		
	}

}
