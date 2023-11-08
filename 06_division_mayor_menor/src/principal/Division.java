package principal;

public class Division {

	public static void main(String[] args) {
		int a=20;
		int b=30;
		int div;
		/*if(a>b) {
			div=a/b;
		}else {
			div=b/a;
		}*/
		//div=a>b?a/b:b/a;
		div=Math.max(a, b)/Math.min(a, b);
		System.out.println("La división es: "+div);

	}

}
