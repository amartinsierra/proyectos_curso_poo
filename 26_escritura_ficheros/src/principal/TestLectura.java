package principal;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TestLectura {

	public static void main(String[] args) {
		String dir="c:\\temp\\dias_semana.txt";
		try(FileReader fr=new FileReader(dir);
				BufferedReader bf=new BufferedReader(fr);){
			String linea;
			while((linea=bf.readLine())!=null) {
				System.out.println(linea);
			}
			
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}

	}

}
