package view;

import java.util.InputMismatchException;
import java.util.Scanner;

import model.Alumno;
import service.AlumnosService;

public class ProgramaAlumnos {
	static AlumnosService service=new AlumnosService();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner sc=new Scanner(System.in);
				//controlar excepción, pero que permita al programa
				//seguir adelante
				int opcion;
				do {
					mostrarMenu();
					try {
						opcion=Integer.parseInt(sc.nextLine());
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
								buscarAlumno();
								break;
							case 6:
								eliminarAlumno();
								break;
							case 7:
								System.out.println("Hasta luego");
						}
					}
					catch(NumberFormatException ex) {
						System.out.println(ex.getMessage());
						System.out.println("opcion incorrecta, vuelva a intentarlo");
						opcion=0;
					}
				}while(opcion!=7);

	}
	
	private static void buscarAlumno(){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("teclee email del alumno");
		
		String email =sc.nextLine();
		Alumno alumno=service.buscarAlumno(email);
		if(alumno!=null) {
			System.out.println("El alumno es : " + alumno.getNombre() +" curso: "+alumno.getCurso() );
		}else {
			System.out.println("El alumno no existe");
		}
	}
	private static void eliminarAlumno() {		
		Scanner sc=new Scanner(System.in);
		System.out.println("Email:");
		String email = sc.nextLine();
		if (service.eliminar(email))
			System.out.println("Alumno eliminado correctamente");
		else
			System.out.println("No se ha podido eliminar el alumno. El alumno no existe");
	}
	
	
	private static void mostrarMenu() {
		System.out.println("1.- Alta de alumno");
		System.out.println("2.- Media notas por curso");
		System.out.println("3.- Aprobados totales");
		System.out.println("4.- Alumnos por curso");
		System.out.println("5.- Buscar alumno");
		System.out.println("6.- Eliminar alumno");
		System.out.println("7.- Salir");
	}
	private static void pedirDatos() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Nombre alumno:");
		String nombre=sc.nextLine();
		System.out.println("Curso:");
		String curso=sc.nextLine();
		System.out.println("Nota:");
		try {
			double nota=Double.parseDouble(sc.nextLine());
		
			System.out.println("Email:");
			String email=sc.nextLine();
			Alumno alumno=new Alumno(nombre,curso,nota,email);
			//Alumno alumno=new Alumno(nombre,email);
			if(service.nuevoAlumno(alumno)){
				System.out.println("Alumno añadido!!");
			}else {
				System.out.println("Email repetido, no se añadió al alumno!!");
			}
		}
		catch(NumberFormatException ex) {
			System.out.println("La nota no es válida");
		}
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
