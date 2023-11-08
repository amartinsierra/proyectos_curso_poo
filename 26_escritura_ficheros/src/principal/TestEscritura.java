package principal;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class TestEscritura {

	public static void main(String[] args) {
		String dir="c:\\temp\\dias_semana.txt";
		//objeto FileOutputStream para indicar donde y como escribimos
		try(FileOutputStream fos=new FileOutputStream(dir, true);
			//objeto escritura
			PrintStream out=new PrintStream(fos);) {
			
			//a escribir
			out.println("jueves");
			out.println("viernes");
			out.println("sábado");
			
		}
		catch(IOException ex) {
			ex.printStackTrace(); //volcado traza de error
		}
	}

}
