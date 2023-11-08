package service;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class NotasService {
	String ruta="c:\\temp\\notas.txt";
	
	//métodos
	public boolean guardarNota(double nota) {
		try (FileOutputStream fos=new FileOutputStream(ruta,true);
				PrintStream out=new PrintStream(fos);){
			out.println(nota);
			return true;
		}
		catch(IOException ex) {
			ex.printStackTrace();
			return false;
		}
	}
	
	//media
	public double media() {
		double media = 0;
		int cont = 0;
		try(FileReader fr=new FileReader(ruta);
				BufferedReader br=new BufferedReader(fr)) {
			String linea;
			while((linea=br.readLine())!=null) {	//condición de fin de fichero
				try {
					media += Double.parseDouble(linea);
				}
				catch(NumberFormatException ex) {
					media+=0;
				}
				cont++;
			}
			return media/cont;
		}
		catch(IOException e){
			e.printStackTrace();  //volcado traza de error
			return -1;
		}	
		
	}
	public int aprobados() {
		
		int aprobados = 0;
		try(FileReader fr=new FileReader(ruta);
				BufferedReader br=new BufferedReader(fr)) {
			String linea;
			while((linea=br.readLine())!=null) {	//condición de fin de fichero
				try {
					if(Double.parseDouble(linea)>=5) {
						aprobados++;
					}
				}
				catch(NumberFormatException ex) {
					
				}
				
			}
			return aprobados;
		}
		catch(IOException e){
			e.printStackTrace();  //volcado traza de error
			return -1;
		}
	}
	
	public List<Double> notas() {
		List<Double> notas=new ArrayList<>();
		try(FileReader fr=new FileReader(ruta);
				BufferedReader br=new BufferedReader(fr)) {
			String linea;
			while((linea=br.readLine())!=null) {				
				notas.add(Double.parseDouble(linea));
			}
		}
		catch(IOException e){
			e.printStackTrace();  //volcado traza de error
			
		}
		return notas;
	}
}
