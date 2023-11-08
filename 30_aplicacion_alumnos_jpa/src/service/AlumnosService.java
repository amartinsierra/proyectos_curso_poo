package service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import model.Alumno;

public class AlumnosService {	
	EntityManager em;
	EntityTransaction tx;
	public AlumnosService() {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("academiaPU");
		em=factory.createEntityManager();
		tx=em.getTransaction();//el objeto transaction se requiere para operaciones de acción
	}
	
	public void nuevoAlumno(Alumno alumno) {
		tx.begin();
		em.persist(alumno);
		tx.commit();
		
	}
	public void nuevoAlumno(String nombre, String curso, double nota, String email ) {
		nuevoAlumno(new Alumno(nombre,curso,nota,email));
	}
	public double mediaPorCurso(String curso) {
		String jpql="select avg(a.nota) from Alumno a where a.curso=?1";
		TypedQuery<Double> tq=em.createQuery(jpql,Double.class);
		tq.setParameter(1, curso);
		return tq.getSingleResult();
	}
	public int aprobadosTotales() {
		String jpql="select count(a) from Alumno a where a.nota>=5";
		TypedQuery<Long> tq=em.createQuery(jpql,Long.class);
		return tq.getSingleResult().intValue();
	}
	
	public List<Alumno> alumnosDeCurso(String curso) {
		//String jpql="select a from Alumno a where a.curso=?1";
		//creamos la TypedQuery
		TypedQuery<Alumno> tq=em.createNamedQuery("Alumnos.findByCurso",Alumno.class);
		//sustituir parametro por valor
		tq.setParameter(1, curso);
		return tq.getResultList();
	}
	
	public void eliminarAlumno(int idAlumno) {
		//localizar al alumno por su clave
		Alumno alumno=em.find(Alumno.class, idAlumno);
		if(alumno!=null) {
			tx.begin();
			em.remove(alumno);
			tx.commit();
		}
	}
	
	public void eliminarAlumnosPorCurso(String curso) {
		String jpql="delete from Alumno a where a.curso=?1";
		Query q=em.createQuery(jpql);
		q.setParameter(1, curso);
		tx.begin();
		q.executeUpdate();
		tx.commit();
	}
	
}
