package service;

import java.util.ArrayList;

import model.Alumno;

public class AlumnosService {
	ArrayList<Alumno> alumnos=new ArrayList<>();
	//métodos
	
	public void nuevoAlumno(Alumno alumno) {
		alumnos.add(alumno);
	}
	public void nuevoAlumno(String nombre, String curso, double nota, String email ) {
		alumnos.add(new Alumno(nombre,curso,nota,email));
	}
	public double mediaPorCurso(String curso) {
		double media=0;
		int cont=0;
		for(Alumno al:alumnos) {
			if(al.getCurso().equals(curso)) {
				cont++;
				media+=al.getNota();
			}
		}
		return media/cont;
	}
	public int aprobadosTotales() {
		int aprobados=0;
		for(Alumno al:alumnos) {
			if(al.getNota()>=5) {
				aprobados++;
			}
		}
		return aprobados;
	}
	
	public ArrayList<Alumno> alumnosDeCurso(String curso) {
		ArrayList<Alumno> alumnosCurso=new ArrayList<Alumno>();
		for(Alumno al:alumnos) {
			if(al.getCurso().equals(curso)) {
				alumnosCurso.add(al);
			}
		}
		return alumnosCurso;
	}
	
	
}
