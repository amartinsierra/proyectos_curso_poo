package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="alumnos")
@NamedQuery(name = "Alumno.findByCurso",query="select a from Alumno a where a.curso=?1")
public class Alumno {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idAlumno;
	private String nombre;
	private String curso;
	private double nota;
	private String email;
	public Alumno(String nombre, String curso, double nota, String email) {
		this.nombre = nombre;
		this.curso = curso;
		this.nota = nota;
		this.email = email;
	}
	
	public Alumno(int idAlumno, String nombre, String curso, double nota, String email) {
		super();
		this.idAlumno = idAlumno;
		this.nombre = nombre;
		this.curso = curso;
		this.nota = nota;
		this.email = email;
	}

	public Alumno() {

	}	
	
	public Alumno(String nombre, String email) {
		this.nombre = nombre;
		this.email = email;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public int getIdAlumno() {
		return idAlumno;
	}

	public void setIdAlumno(int idAlumno) {
		this.idAlumno = idAlumno;
	}
	
}
