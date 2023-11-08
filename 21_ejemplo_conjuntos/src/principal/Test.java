package principal;

import java.util.HashSet;

public class Test {

	public static void main(String[] args) {
		HashSet<String> dias=new HashSet<String>();
		dias.add("lunes");
		dias.add("martes");
		dias.add("miércoles");
		dias.add("jueves");
		dias.add("viernes");
		dias.add("lunes");
		for(String d:dias) {
			System.out.println(d);
		}
	}

}
