package service;

import java.util.ArrayList;

public class ListNumber extends ArrayList<Integer> {
	public int first() {
		return this.get(0);
	}
	
	public int last() {
		return get(size()-1);
	}
	
	public int sum() {
		int suma=0;
		/*for(int i=0;i<size();i++) {
			suma+=get(i);
		}*/
		for(int n:this) {
			suma+=n;
		}
		return suma;
	}
	/*@Override
	//sobrescritura del método add() para que impida repetir números
	public boolean add(Integer n) {
		if(!contains(n)) { //si no contiene el número lo añadimos
			return super.add(n);
		}
		return false;
	}*/

	@Override
	public boolean add(Integer e) {
		if(!contains(e)) { //si no contiene el número lo añadimos
			return super.add(e);
		}
		return false;
	}
	
	
}

