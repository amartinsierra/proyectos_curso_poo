package view;

import java.util.List;
import java.util.Scanner;

import service.NotasService;

public class ProgramaNotas {
	static NotasService service;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		service=new NotasService();
		int opcion;
		do {
			mostrarMenu();
			opcion=sc.nextInt();
			switch(opcion) {
				case 1:
					pedirNota();
					break;
				case 2:
					mostrarMedia();
					break;
				case 3:
					mostrarAprobados();
					break;
				case 4:
					mostrarNotas();
					break;
				case 5:
					System.out.println("Hasta luego");
			}
		}while(opcion!=5);
	}
	
	private static void mostrarMenu() {
		System.out.println("1.- Introduce nota");
		System.out.println("2.- Mostrar media");
		System.out.println("3.- total de aprobados");
		System.out.println("4.- Ver notas");
		System.out.println("5.- Salir");
	}
	private static void pedirNota() {		
		System.out.println("Introduzca una nota...");
		Scanner sc = new Scanner(System.in);
		Double nota = sc.nextDouble();
		if (!service.guardarNota(nota) ) {
			System.out.println("No se ha podido guardar la nota");
		}	
		//sc.close();
	}
	private static void mostrarMedia() {
		System.out.println("La media es: "+service.media());
	}
	private static void mostrarAprobados() {
		System.out.println("Total de aprobados: "+service.aprobados());
	}
	private static void mostrarNotas() {
		List<Double> notas=service.notas();
		for(Double n:notas) {
			System.out.println(n);
		}
	}

}
