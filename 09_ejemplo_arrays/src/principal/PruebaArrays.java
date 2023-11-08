package principal;

public class PruebaArrays {

	public static void main(String[] args) {
		int[] pares=new int[10];
		for(int i=0;i<pares.length;i++) {
			pares[i]=i*2;
		}
		
		for(int i=0;i<pares.length;i++) {
			System.out.print(pares[i]+",");
		}

		//enhanced for
		for(int num:pares) {
			System.out.print(num+",");
		}
		
	}

}
