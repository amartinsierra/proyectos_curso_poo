package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Alumno;

public class AlumnosService {
	private String cadenaCon="jdbc:mysql://localhost:3307/academia";
	private String usuario="root";
	private String password="root";
	
	public void nuevoAlumno(Alumno alumno) {
		try(Connection con=DriverManager.getConnection(cadenaCon, usuario, password);){
			String sql="insert into alumnos(nombre,curso,nota,email) values(?,?,?,?)";
			PreparedStatement ps=con.prepareStatement(sql);
			//valores a parámetros
			ps.setString(1, alumno.getNombre());
			ps.setString(2, alumno.getCurso());
			ps.setDouble(3, alumno.getNota());
			ps.setString(4, alumno.getEmail());
			//ejecutamos consulta
			ps.execute();
		}
		catch(SQLException ex) {
			ex.printStackTrace();
		}
		
	}
	public void nuevoAlumno(String nombre, String curso, double nota, String email ) {
		nuevoAlumno(new Alumno(nombre,curso,nota,email));
	}
	public double mediaPorCurso(String curso) {
		double media=0;
		try(Connection con=DriverManager.getConnection(cadenaCon, usuario, password);){
			String sql="select avg(nota) as media from alumnos where curso like ?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, "%"+curso+"%");
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				media=rs.getDouble("media");
			}
		}
		catch(SQLException ex) {
			ex.printStackTrace();
		}
		return media;
	}
	public int aprobadosTotales() {
		int aprobados=0;
		try(Connection con=DriverManager.getConnection(cadenaCon, usuario, password);){
			String sql="select count(*) from alumnos where nota>=5";
			PreparedStatement ps=con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				aprobados=rs.getInt(1);
			}
		}
		catch(SQLException ex) {
			ex.printStackTrace();
		}
		return aprobados;
		
	}
	
	public ArrayList<Alumno> alumnosDeCurso(String curso) {
		ArrayList<Alumno> alumnosCurso=new ArrayList<Alumno>();
		try(Connection con=DriverManager.getConnection(cadenaCon, usuario, password);){
			String sql="select * from alumnos where curso like ?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, "%"+curso+"%");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				Alumno alumno=new Alumno(rs.getString("nombre"), 
						rs.getString("curso"), 
						rs.getDouble("nota"), 
						rs.getString("email"));
				alumnosCurso.add(alumno);
			}
		}
		catch(SQLException ex) {
			ex.printStackTrace();
		}
		return alumnosCurso;
	}
	
	
}
