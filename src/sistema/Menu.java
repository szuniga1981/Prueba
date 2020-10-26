package sistema;



	import java.util.InputMismatchException;
	import java.util.Scanner;
	 
	public class Menu {
	 
	    public static void main(String[] args) {
	 
	        Scanner sn = new Scanner(System.in);
	        boolean salir = false;
	        int opcion; 
	 
	        while (!salir) {
	 
	            System.out.println("1. Crear Alumno");
	            System.out.println("2. Listar Alumno");
	            System.out.println("3. Agregar Materias");
	            System.out.println("4. Agregar Notas");
	            System.out.println("5. Cargar Datos");
	            System.out.println("6. Exportar Datos");
	            System.out.println("7. Salir");
	 
	            try {
	 
	                System.out.println("Escribe una de las opciones");
	                opcion = sn.nextInt();
	 
	                switch (opcion) {
	                    case 1:
	                        System.out.println("Has seleccionado la opcion 1");
	                        break;
	                    case 2:
	                        System.out.println("Has seleccionado la opcion 2");
	                        break;
	                    case 3:
	                        System.out.println("Has seleccionado la opcion 3");
	                        break;
	                    case 4:
	                        System.out.println("Has seleccionado la opcion 4");
	                        break;
	                    case 5:
	                        System.out.println("Has seleccionado la opcion 5");
	                        break;
	                    case 6:
	                        System.out.println("Has seleccionado la opcion 6");
	                        break;
	                    case 7:
	                        salir = true;
	                        break;
	                    default:
	                        System.out.println("Solo números entre 1 y 7");
	                }
	            } catch (InputMismatchException e) {
	                System.out.println("Debes insertar un número");
	                sn.next();
	               
	            }
	        }
	       sn.close(); 
	 
	    }
	

	}


