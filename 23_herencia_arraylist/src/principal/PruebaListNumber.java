package principal;

import service.ListNumber;

public class PruebaListNumber {

	public static void main(String[] args) {
		ListNumber lst=new ListNumber();
		lst.add(200);
		lst.add(780);
		lst.add(150);
		lst.add(300);
		lst.remove(3);
		lst.add(200);
		System.out.println("Primero: "+lst.first());
		System.out.println("Último: "+lst.last());
		System.out.println("La suma de todos: "+lst.sum());
	}

}
