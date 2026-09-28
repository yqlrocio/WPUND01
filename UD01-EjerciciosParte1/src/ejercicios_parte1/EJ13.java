package ejercicios_parte1;

import java.util.Scanner;

public class EJ13 {

	public static void main(String[] args) {
		
// Diseñar un algoritmo que nos indique si podemos salir a la calle. Existen aspectos que influirán en esta decisión: solo podremos salir a la calle si no está lloviendo y hemos finalizado nuestras tareas. 
// Existe una opción en la que, indistintamente de lo anterior, podremos salir a la calle: el hecho de tener que ir a la biblioteca.
// Solicitar al usuario (mediante un booleano) si llueve, si ha finalizado las tareas y si necesita ir a la biblioteca.
// El algoritmo debe mostrar mediante un booleano (true o false) si es posible que se le otorgue permiso para salir a la calle.

		//Crear Scanner
		Scanner reader = new Scanner (System.in); 
		
		//Crear variables
		boolean estaLloviendo; 
		boolean tareasTerminadas;
		boolean irBiblioteca; 
		boolean salir; 
		
		// Preguntar al usuario si fuera esta lloviendo, si a terminado de realizar la tarea y si necesita ir a la biblioteca
        System.out.println("¿Está fuera lloviendo?"); 
        estaLloviendo = reader.nextBoolean(); 
        
        System.out.println("¿Has terminado de hacer la tarea?"); 
        tareasTerminadas = reader.nextBoolean();
        
        System.out.println("¿Tienes que ir a la biblioteca?");  
        irBiblioteca = reader.nextBoolean();
	
        salir = (!estaLloviendo && tareasTerminadas) || irBiblioteca;

       System.out.println("¿Puedo salir a la calle?" + salir);
       
       reader.close();
	}

}