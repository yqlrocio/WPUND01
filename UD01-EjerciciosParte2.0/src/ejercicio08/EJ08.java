package ejercicio08;

import java.util.Scanner;

public class EJ08 {

	public static void main(String[] args) {

		//	Una empresa guarda productos en cajas con una 
		//	capacidad determinada. Pide al usuario el número 
		//	de productos y la capacidad de cada caja. Calcula 
		//	cuántas cajas son necesarias para guardar todos 
		//	los productos utilizando Math.ceil(). El resultado 
		//	final debe mostrarse como un número entero.
		
		// Creamos scanner
		Scanner reader = new Scanner(System.in);
		
		// Creamos variable para almacenar numProducto,  capacidadCaja y caja
		Integer numProducto; 
		Integer capacidadCaja; 
		Integer caja; 
		
		// Pedir al usuario numProducto y capacidadCaja
		System.out.println("Introduce el número de productos: ");
		numProducto = reader.nextInt(); 
		System.out.println("Introduce la capacidad de cada caja: ");
		capacidadCaja = reader.nextInt(); 
		
		// Calcular cuantas cajas habrá
		caja = numProducto / capacidadCaja; 
		
		// Mostrar por pantalla cuantas cajas salen 
		System.out.println("Sería necesario: " + Math.ceil(caja) + " cajas");
		
		// Cerramos scanner
		reader.close(); 
	}

}
