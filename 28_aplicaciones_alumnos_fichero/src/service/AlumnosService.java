package service;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;

import model.Alumno;

public class AlumnosService {
	private String dir="c:\\temp\\alumnos.txt";
	
	public void nuevoAlumno(Alumno alumno) {
		String fila=alumno.getNombre()+","+alumno.getCurso()+","+alumno.getEmail()+","+alumno.getNota();
		try(FileOutputStream fos=new FileOutputStream(dir, true);
				PrintStream out=new PrintStream(fos);){
			out.println(fila);
		}catch(IOException ex) {
			ex.printStackTrace();
		}
	}
	public void nuevoAlumno(String nombre, String curso, double nota, String email ) {
		nuevoAlumno(new Alumno(nombre,curso,nota,email));
	}
	public double mediaPorCurso(String curso) {
		double media=0;
		int cont=0;
		try(FileReader fr=new FileReader(dir);
				BufferedReader br=new BufferedReader(fr)) {
			String linea;
			while((linea=br.readLine())!=null) {	//condición de fin de fichero
				try {
					String[] datos=linea.split(",");
					if(datos[1].equals(curso)) {
						media += Double.parseDouble(datos[3]);//la nota es el último dato
						cont++;
					}				
				}
				catch(NumberFormatException ex) {
					media+=0;
				}				
			}
			return media/cont;
		}
		catch(IOException e){
			e.printStackTrace();  //volcado traza de error
			return -1;
		}
		catch(ArithmeticException ex) {
			ex.printStackTrace(); 
			return -1;
		}
	}
	public int aprobadosTotales() {
		int aprobados = 0;
		try(FileReader fr=new FileReader(dir);
				BufferedReader br=new BufferedReader(fr)) {
			String linea;
			while((linea=br.readLine())!=null) {	//condición de fin de fichero
				try {
					String[] datos=linea.split(",");
					if(Double.parseDouble(datos[3])>=5) {
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
	
	public ArrayList<Alumno> alumnosDeCurso(String curso) {
		ArrayList<Alumno> alumnosCurso=new ArrayList<Alumno>();
		try(FileReader fr=new FileReader(dir);
				BufferedReader br=new BufferedReader(fr)) {
			String linea;
			while((linea=br.readLine())!=null) {	//condición de fin de fichero
				String[] datos=linea.split(",");
				if(datos[1].equals(curso)) {
					//construimos objeto alumno con los datos del array
					Alumno alumno=new Alumno(datos[0], curso, Double.parseDouble(datos[3]), datos[2]);
					alumnosCurso.add(alumno);
				}
			}
		}
		catch(IOException e){
			e.printStackTrace();  //volcado traza de error
		}
		return alumnosCurso;
	}
	
	
}
