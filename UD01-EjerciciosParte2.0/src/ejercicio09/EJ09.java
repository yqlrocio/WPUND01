package ejercicio09;

import java.util.Scanner;

public class EJ09 {

	public static void main(String[] args) {
		
		//	Un depósito contiene una cantidad de litros de agua 
		//	y se quiere llenar botellas de una capacidad determinada. 
		//	Solicita ambos valores y calcula cuántas botellas completas 
		//	pueden llenarse utilizando Math.floor().
		
		// Creamos scanner
		Scanner reader = new Scanner(System.in); 
		
		// Creamos variables para almacenar: cantidadAguaDeposito,  capacidadAguaBotella y botella
		double cantidadAguaDeposito; 
		double capacidadAguaBotella; 
		Integer botella; 
		
		// Pedir al usuario cantidadAguaDeposito y la capacidadAguaBotella
		System.out.println("Introduce la cantidad de litros de agua del depósito: ");
		cantidadAguaDeposito = reader.nextDouble();
		System.out.println("Introduce la capacidad de agua de las botellas: ");
		capacidadAguaBotella = reader.nextDouble();
		
		// Calcular cuántas botellas se puede rellenar (número entero)
		botella = (int) (cantidadAguaDeposito / capacidadAguaBotella); 
		
		// Mostramos por pantalla la información obtenida y calculada
		System.out.println("La cantidad de litros de agua del depósito es: " + cantidadAguaDeposito);
		System.out.println("La capacidad de agua de las botellas es: " + capacidadAguaBotella);
		System.out.println("Podemos rellenar: " + botella + " botellas");
		
		// Cerramos scanner 
		reader.close();

	}

}
