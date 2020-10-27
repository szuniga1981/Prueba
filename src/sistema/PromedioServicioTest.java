package sistema;

import java.util.Scanner;

public class PromedioServicioTest {

		 
		 
	    public static void main(String[] args) {
	      Scanner read = new Scanner (System.in);
	        read = new Scanner (System.in);
	             Scanner a1= new Scanner (System.in);
	        int OPC;
	        double a;
	        do{
	            System.out.println("Bienvenido");
	            System.out.println("1 Iniciar");
	            System.out.println("2.Salir");
	               OPC = read.nextInt();
	        switch (OPC){
	            case 1:
	                    System.out.println("Promedio");
	             System.out.println("Inserte un numero");
	             a = a1.nextDouble();
	 
	             if (a<=3.9)
	             {
	                 System.out.println("Reprobado ");
	             }
	             if (a>=4.0 && a<=7.0)
	             {
	                 System.out.println("Suficiente");
	             }
	            
	                }
	        }while(OPC<2);
	    }
	}

