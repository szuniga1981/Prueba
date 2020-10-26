package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import sistema.Menu;

public class Main {
// Scanner (static)

	static Scanner reader = new Scanner(System.in);
	static int contadorId = 0;

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
		List<Vendedor> listaVendedores = new ArrayList<Vendedor>();
		List<Comprador> listaCompradores = new ArrayList<Comprador>();

		do {
			resultado = menuPrincipal.contruirMenu(opcionesMenu, reader);
			if (resultado == 1) {
				listaVendedores.add(obtenerDatosVendedor());
				System.out.println("Vendedor creado....");

			} else if (resultado == 2) {
				listaCompradores.add(obtenerDatosComprador());
				System.out.println("Comprador creado....");
			} else if (resultado == 3) {
				System.out.println(listaVendedores);
			} else if (resultado == 4) {
				System.out.println(listaCompradores);
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

	private static Vendedor obtenerDatosVendedor() {

		contadorId = contadorId + 1;
		int idVendedor = contadorId;
		reader.nextLine();
		System.out.println("Introduzca Nombre: ");
		String nomVend = reader.nextLine();
		System.out.println("Introduzca Correo: ");
		String correoVend = reader.nextLine();
		System.out.println("Introduzca password: ");
		String passVend = reader.nextLine();
		boolean isAdm = false;

		return crearVendedor(idVendedor, nomVend, correoVend, isAdm, passVend);

	}

	private static List<String> crearOpcionesMenu() {

		List<String> opciones = new ArrayList<String>();
		opciones.add("Crear vendedor");// 0
		opciones.add("Crear comprador");// 1
		opciones.add("Lista vendedores");// 2
		opciones.add("Lista compradores");// 3
		opciones.add("Salir");// 4

		return opciones;

	}

	public static Vendedor crearVendedor(int pId, String pNombre, String pCorreo, boolean pEsAdmin, String pPassword) {
		Vendedor vendedor = new Vendedor(pId, pNombre, pCorreo, pEsAdmin, pPassword);
		return vendedor;

	}

	public static Comprador crearComprador(int pId, String pNombre, String pCorreo, boolean pEsAdmin,
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


