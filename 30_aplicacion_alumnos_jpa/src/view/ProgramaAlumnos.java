package view;

import java.util.Scanner;

import model.Alumno;
import service.AlumnosService;

public class ProgramaAlumnos {
	static AlumnosService service=new AlumnosService();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner sc=new Scanner(System.in);
				
				int opcion;
				do {
					mostrarMenu();
					opcion=sc.nextInt();
					switch(opcion) {
						case 1:
							pedirDatos();
							break;
						case 2:
							mostrarMedia();
							break;
						case 3:
							mostrarAprobados();
							break;
						case 4:
							mostrarAlumnos();
							break;
						case 5:
							eliminarPorCurso();
							break;
						case 6:
							System.out.println("Hasta luego");
					}
				}while(opcion!=6);

	}
	private static void mostrarMenu() {
		System.out.println("1.- Alta de alumno");
		System.out.println("2.- Media notas por curso");
		System.out.println("3.- Aprobados totales");
		System.out.println("4.- Alumnos por curso");
		System.out.println("5.- Eliminar por curso");
		System.out.println("6.- Salir");
	}
	private static void eliminarPorCurso() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Curso:");
		String curso=sc.nextLine();
		service.eliminarAlumnosPorCurso(curso);
	}
	private static void pedirDatos() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Nombre alumno:");
		String nombre=sc.nextLine();
		System.out.println("Curso:");
		String curso=sc.nextLine();
		System.out.println("Nota:");
		double nota=Double.parseDouble(sc.nextLine());
		System.out.println("Email:");
		String email=sc.nextLine();
		Alumno alumno=new Alumno(nombre,curso,nota,email);
		//Alumno alumno=new Alumno(nombre,email);
		service.nuevoAlumno(alumno);
	}
	private static void mostrarMedia() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Curso:");
		String curso=sc.nextLine();
		System.out.println("La media de ese curso es: "+service.mediaPorCurso(curso));
	}
	private static void mostrarAprobados() {
		System.out.println("Total de aprobados: "+service.aprobadosTotales());
	}
	private static void mostrarAlumnos() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Curso:");
		String curso=sc.nextLine();
		for(Alumno al:service.alumnosDeCurso(curso)) {
			System.out.println("Nombre: "+al.getNombre()+" - Curso: "+al.getCurso());
		}
	}
	
}
