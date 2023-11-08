package operaciones;

public class Calculadora {
	public final double PI=3.1416;
	private int a,b;
	public Calculadora(int a, int b) {
		this.a=a;
		this.b=b;
	}
	public Calculadora() {
		this.a=10;
		this.b=2;
	}
	
	public void establecerA(int a) {
		this.a=a;
	}
	public void establecerB(int b) {
		this.b=b;
	}
	public int suma() {
		int s=a+b;
		return s;
	}
	public int multiplica() {
		return a*b;
	}
	public int dividir() {
		return a/b;
	}
	
	public static int factorial(int n) {
		int res=1;
		for(int i=2;i<=n;i++) {
			res*=i;
		}
		return res;
	}
}
