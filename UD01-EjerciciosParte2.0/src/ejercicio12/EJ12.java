package ejercicio12;

import java.util.Scanner;

public class EJ12 {

	public static void main(String[] args) {
		
		//	Pide al usuario su edad y utiliza el operador ternario 
		//	para calcular el precio de una entrada: 6,50 € si es 
		//	menor de 18 años y 9,50 € en caso contrario. Muestra el 
		//	precio correspondiente.
		
		// Creamos scanner
		Scanner reader = new Scanner(System.in);
		
		// Creamos variable para almacenar la edad y el precio de la entrada en función de la edad
		Integer edad; 
		String precioEntrada;
		
		// Preguntamos al usuario por su edad
		System.out.println("¿Cuántos años tienes?");
		edad = reader.nextInt(); 
		
		// Usamos ternario para calcular el precio 
		precioEntrada = edad >= 18 ? "Precio de la entrada: 9.50€" : "Precio de la entrada: 6.50€";
		
		// Mostramos por pantalla el resultado
		System.out.println("Tienes: " + edad + " años --> " + precioEntrada);
		
		// Cerramos scanner
		reader.close();
	}

}
