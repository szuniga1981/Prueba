package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import sistema.Alumno;
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
	//	List<Comprador> listaCompradores = new ArrayList<Comprador>();

		do {
			resultado = menuPrincipal.contruirMenu(opcionesMenu, reader);
			if (resultado == 1) {
				listaAlumno.add(obtenerDatosAlumno());
				System.out.println("Alumno creado....");

			/*} else if (resultado == 2) {
				//listaCompradores.add(obtenerDatosComprador());
				//System.out.println("Comprador creado....");
			} else if (resultado == 3) {
				System.out.println(listaAlumno);
			} else if (resultado == 4) {
				System.out.println(listaCompradores);
				*/
			} else if (resultado == 5) {
				System.out.println("Saliendo ....");
				continuar = true;
			}

		} while (!continuar);

		// contruirMenu(List<String> pOpcionesMenu, Scanner leer)
		/*
		 * int idVendedor=1; String nombreVendedor="Pepito Grillo"; String
		 * correoVendedor="pepito.grillo@pinocho.com"; boolean esAdmin=true; String
		 * password="1234";
		 * 
		 * Vendedor
		 * vendedor1=crearVendedor(idVendedor,nombreVendedor,correoVendedor,esAdmin,
		 * password); imprimirVendedor(vendedor1);
		 */
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
		Alumno alumno = new Alumno(pRUT, pNombre,pApellido,pDireccion);
		return alumno;

	}
}
/*	public static Comprador crearComprador(int pId, String pNombre, String pCorreo, boolean pEsAdmin,
			String pPassword) {
		Comprador comprador = new Comprador(pId, pNombre, pCorreo, pEsAdmin, pPassword);
		return comprador;

	}

	public static void imprimirVendedor(Vendedor pVendedor) {
		String admin = "No";
		if (pVendedor.isEsAdmin() == true) {
			admin = "Si";
		}
		System.out.println("Id vendedor: " + pVendedor.getId());
		System.out.println("Nombre: " + pVendedor.getNombre());
		System.out.println("Correo vendedor: " + pVendedor.getCorreo());
		System.out.println("Es Admin: " + admin);
	}

	private static Comprador obtenerDatosComprador() {

		contadorId = contadorId + 1;
		int idComprador = contadorId;
		reader.nextLine();
		System.out.println("Introduzca Nombre: ");
		String nomComp = reader.nextLine();
		System.out.println("Introduzca Correo: ");
		String correoComp = reader.nextLine();
		System.out.println("Introduzca password: ");
		String passComp = reader.nextLine();
		boolean isAdm = false;

		return crearComprador(idComprador, nomComp, correoComp, isAdm, passComp);
	}
}
*/

