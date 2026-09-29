package ejercicios_parte2;

import java.util.Scanner;

public class EJ07 {

	public static void main(String[] args) {

	//	Una empresa que gestiona un parque acuático te 
	//	solicita una aplicación que les ayude a calcular 
	//	el importe que hay que cobrar en la taquilla por 
	//	la compra de una serie de entradas (cuyo número 
	//	será introducido por el usuario). Existen dos 
	//	tipos de entradas: infantiles, que cuestan 15,50€; 
	//	y de adultos, que cuestan 20€. En el caso de que 
	//	el importe total sea igual o superior a 100€, se 
	//	aplicará automáticamente un bono descuento del 5%.
		
		// Creamos scanner 
		Scanner reader = new Scanner(System.in);

		// Creamos variable para almacenar 
		double infantil; 
		double adulto;
		double descuento = 0.05; 
		double total; 
		
		// Pedir al usuario cuántas entradas infantiles y adultas quieren comprar
		System.out.println("¿Cuántas entradas infantiles quieres comprar?");
		infantil = reader.nextDouble(); 
		
		System.out.println("¿Cuántas entradas adultas quieres comprar?");
		adulto = reader.nextDouble(); 
		
		// Calcular el precio
		total = infantil * 15.50 + adulto * 20; 
		
		// Mostrar por pantalla el precio total 
		if (total > 100) {
			System.out.println();
		}
		System.out.println(" " + );
		
		// Cerramos scanner
		reader.close();
		
	}

}
