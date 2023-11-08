package service;

public class TestFiguras {

	public static void main(String[] args) {
		//crear un objeto de cada clase figura, con valores cualquiera
		//y después, mostramos color y superficie de cada figura
		
		/*****sin polimorfismo****/
		/*Circulo c=new Circulo(5, "Naranja");
		System.out.println("Color de la figura: "+c.getColor());
		System.out.println("Superficie: "+c.superficie());
		Triangulo t=new Triangulo(6,4,"Azul");
		System.out.println("Color de la figura: "+t.getColor());
		System.out.println("Superficie: "+t.superficie());
		Rectangulo r=new Rectangulo("Amarillo", 9, 7);
		System.out.println("Color de la figura: "+r.getColor());
		System.out.println("Superficie: "+r.superficie());*/
		/**con polimorfismo***/
		/*Figura f=new Circulo(5, "Naranja");
		mostrarDatos(f);
		f=new Triangulo(6,4,"Azul");
		mostrarDatos(f);
		f=new Rectangulo("Amarillo", 9, 7);
		mostrarDatos(f);*/
		mostrarDatos(new Circulo(5, "Naranja"));
		mostrarDatos(new Triangulo(6,4,"Azul"));
		mostrarDatos(new Rectangulo("Amarillo", 9, 7));

	}
	
	//método para polimorfismo
	static void mostrarDatos(Figura f) {
		System.out.println("Color de la figura: "+f.getColor());
		System.out.println("Superficie: "+f.superficie());
	}

}
