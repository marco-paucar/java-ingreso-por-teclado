package inicio;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Para poder ingresar por teclado
		Scanner teclado = new Scanner(System.in);
		
		
		// Ingreso String
		System.out.print("Ingrese los nombres: ");
		String nombre = teclado.nextLine();
		System.out.println("nombres ingresaddo: "+nombre);
		
		// ingreso un caracter 
		System.out.print("Ingrese el sexo ");
		char caracter = teclado.next().charAt(0);
		System.out.println("Sexo ingreso: "+caracter);
		
		// numero entero
		System.out.print("Ingrese un entero ");
		int entero = teclado.nextInt();
		System.out.println("entero ingresado: "+entero);
		
		// numero long
		System.out.print("Ingrese número telefonico");
		long telefono = teclado.nextLong();
		System.out.println("Telefono ingresado: "+telefono);
		
		// Decimal
		System.out.print("Ingrese número decimal");
		double promedio = teclado.nextDouble();
		System.out.println("numero decimal ingresado: "+promedio);
		
		System.out.println("Fin de programa ");
		

	}

}
