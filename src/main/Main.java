package main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import sistema.Alumno;
import sistema.Materia;
import sistema.Menu;

public class Main {
// Scanner (static)

	static Scanner reader = new Scanner(System.in);
	static String contadorId = "11111111-1";

	public static void main(String[] args) {
		/*
		 * 1. Crear un vendedor 2. Listar atributos del vendedor 3. Metodo/menu para
		 * introducir vendedores (o usuarios)
		 * 
		 * Lista opciones menú Recibir resultado (int)
		 * 
		 */
		List<String> opcionesMenu = crearOpcionesMenu();
		Menu menuPrincipal = new Menu();
		boolean continuar = false;
		int resultado;
		List<Alumno> listaAlumno = new ArrayList<Alumno>();
		List<Materia> listaMateria=new ArrayList<Materia>();
		
		// List<Comprador> listaCompradores = new ArrayList<Comprador>();

		do {
			resultado = menuPrincipal.contruirMenu(opcionesMenu, reader);
			if (resultado == 1) {
				listaAlumno.add(obtenerDatosAlumno());
				System.out.println("Alumno creado....");

			} else if (resultado == 2) {
				System.out.println(listaAlumno);
			} else if (resultado == 3) {
				System.out.println();

			} else if (resultado == 7) {
				System.out.println("Saliendo ....");
				continuar = true;
			}

		} while (!continuar);

		
	}

	private static Alumno obtenerDatosAlumno() {

		contadorId = contadorId + 1;
		String rUTAlumno = contadorId;
		reader.nextLine();
		System.out.println("Introduzca RUT: ");
		String nomAlumno = reader.nextLine();
		System.out.println("Introduzca Nombre: ");
		String apellAlumno = reader.nextLine();
		System.out.println("Introduzca Apellido: ");
		String dirAlumno = reader.nextLine();
		System.out.println("introduce Direccion");

		return crearAlumno(rUTAlumno, nomAlumno, apellAlumno, dirAlumno);

	}

	private static List<String> crearOpcionesMenu() {

		List<String> opciones = new ArrayList<String>();
		opciones.add("Crear Alumno");// 0
		opciones.add("Listar Alumno");// 1
		opciones.add("Agregar Materias");// 2
		opciones.add("Agregar Notas");
		opciones.add("Cargar Datos");
		opciones.add("exportar datos");// 3
		opciones.add("Salir");// 4

		return opciones;

	}

	public static Alumno crearAlumno(String pRUT, String pNombre, String pApellido, String pDireccion) {
		Alumno alumno = new Alumno(pRUT, pNombre, pApellido, pDireccion);
		return alumno;

	}

	public static void listarAlumnos1(Alumno pAlumno) {

		System.out.println("RUT Alumno: " + pAlumno.getRUT());
		System.out.println("Nombre Alumno: " + pAlumno.getNombre());
		System.out.println("Apellido Alumno: " + pAlumno.getApellido());
		System.out.println("Direccion Alumno: " + pAlumno.getDireccion());

	}
	public static void AgregarMaterias (Alumno Palumno,Materia pMateria ) {
		
		System.out.println("RUT Alumno: " + Palumno.getRUT());
		System.out.println("Matematicas" + pMateria.getMatematicas());
		//faltan datos
		
		
	}
	
	public static Materia crearMateria (String pRUT,String pMatematicas, String pLenguaje, String pCiencias, String pHistoria) {
		Materia materia = new Materia(pMatematicas, pLenguaje, pCiencias, pHistoria);
		return materia;
	}
	
	
	private static Materia obtenerDatosAlumno1() {
		
			contadorId = contadorId + 1;
			String rutAlumno = contadorId;
			reader.nextLine();
			System.out.println("Introduzca RUT: ");
			String Materia = reader.nextLine();
			System.out.println("seleccionar materia ");
			return crearMateria(rutAlumno,Materia);			
			
	}
			
	}


