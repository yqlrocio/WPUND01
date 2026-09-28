package ejercicio03;

import java.util.Scanner;

public class EJ03 {

	public static void main(String[] args) {
		
		// Una tienda aplica un descuento fijo del 15% y, 
		// posteriormente, un IVA del 21%. Declara ambos 
		// porcentajes como constantes. Pide el precio 
		// inicial al usuario, calcula el precio final y 
		// muéstralo redondeado a dos cifras decimales 
		// utilizando Math.round().

		// Creamos scanner 
		Scanner reader = new Scanner(System.in);
		
		// Creamos las variables para almacenar los datos 
		double descuento = 0.15;
		double IVA = 0.21;
		double precioInicial; 
		double precioFinal; 
		
		
		// Pedimos al usuario el año actual y el año de nacimiento
		System.out.println("El precio inicial es: ");
		precioInicial = reader.nextDouble();
		
		// Calculamos el precio final
		precioFinal = precioInicial - (descuento + IVA); 
		
		// Mostramos por pantalla el precio final
		System.out.println("El precio final es: " + precioFinal);
		
		// Cerramos scanner
		reader.close();
	}

}
