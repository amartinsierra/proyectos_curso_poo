package principal;

class PruebaVariables{
	int a;
	void m1() {
		int b;
		//varaibles locales no tienen valor inicial
		//System.out.println(b);
		System.out.println(a);
	}
	void m2() {
		int c;
		a=2;
	}
}




public class UsoVariables {
	static char d;
	public static void main(String[] args) {
		char c='@';
		char v=200;
		System.out.println(v);
		//desde Java 10
		var x=10; //int
		var y=1.4; //double
		
	}

}
