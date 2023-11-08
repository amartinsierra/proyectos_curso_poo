package service;

public abstract class Figura {
	private String color;

	public Figura(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public abstract double superficie();
}

class Circulo extends Figura{
	private int radio;
	public Circulo(int radio,String color) {
		super(color);//llamada a constructor sin parámetros de la superclase
		this.radio=radio;
	}
	@Override
	public double superficie() {
		return Math.PI*radio*radio;
	}	
}
class Triangulo extends Figura{
	private int base,altura;
	//completar
	public Triangulo(int base,int altura,String color) {
		super(color);
		this.base=base;
		this.altura=altura;
	}
	@Override
	public double superficie(){
		return base*altura/2;
	}
}
class Rectangulo extends Figura{
	private int ancho, alto;

	public Rectangulo(String color, int ancho, int alto) {
		super(color);
		this.ancho = ancho;
		this.alto = alto;
	}

	@Override
	public double superficie() {
		return ancho*alto;
	}
	
}