package service;




import java.util.ArrayList;
import java.util.HashMap;

import model.Alumno;

public class AlumnosService {
	HashMap<String,Alumno> alumnos=new HashMap<>();
	//métodos
	//si se añade, devuelve true, si no false
	public boolean nuevoAlumno(Alumno alumno) {
		//preguntamos si no esta siendo usada esa clave
		if(alumnos.containsKey(alumno.getEmail())==false) {
			alumnos.put(alumno.getEmail(), alumno);
			return true;
		}
		return false;
	}
	public boolean nuevoAlumno(String nombre, String curso, double nota, String email ) {
		if(!alumnos.containsKey(email)) {
			alumnos.put(email,new Alumno(nombre,curso,nota,email));
			return true;
		}
		return false;
	}
	public double mediaPorCurso(String curso) {
		double media=0;
		int cont=0;
		//recorremos los valores, que contienen unicamente los alumnos
		for(Alumno al:alumnos.values()) {
			if(al.getCurso().equals(curso)) {
				cont++;
				media+=al.getNota();
			}
		}
		return media/cont;
	}
	public int aprobadosTotales() {
		int aprobados=0;
		for(Alumno al:alumnos.values()) {
			if(al.getNota()>=5) {
				aprobados++;
			}
		}
		return aprobados;
	}
	
	public ArrayList<Alumno> alumnosDeCurso(String curso) {
		ArrayList<Alumno> alumnosCurso=new ArrayList<Alumno>();
		for(Alumno al:alumnos.values()) {
			if(al.getCurso().equals(curso)) {
				alumnosCurso.add(al);
			}
		}
		return alumnosCurso;
	}
	
	//método que recibe el email, y entrega el alumno que tiene dicho email
	public Alumno buscarAlumno(String email) {
		return alumnos.get(email);//si no hay email devuelve null
		/*for(Alumno a:alumnos.values()) {
			if(a.getEmail().equals(email)) {
				return a;
			}
		}
		return null;*/
	}
	public boolean eliminar(String email) {
		if(alumnos.remove(email)!=null) {
			return true;
		}
		return false;
	}
	
	
}
