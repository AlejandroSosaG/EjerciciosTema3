package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0; // Esta variable es la que pediremos al usuario.
		int cant=0; // Esta es la cantidad de números introducidos por el usuario.
		// Generación de escaner.
		Scanner sc = new Scanner(System.in);
		// Pedimos al usuario que escriba el primer número entero.
		System.out.println("Escriba un número, si no quiere hacerlo introduzca un número negativo");
		// Asignamos a la variable num el valor introducido.
		num = sc.nextInt();
		// Mientras el número sea mayor o igual a 0.
		while (num>=0) {
			// Aumentamos la cantidad de números introducidos.
			cant++;
			// Pedimos al usuario que escriba el siguente número entero.
			System.out.println("Escriba un número, si no quiere hacerlo introduzca un número negativo");
			// asignamos a la variable num el nuevo valor introducido.
			num = sc.nextInt();
		}
		// Mostramos un mensaje diciendo la cantidad de números introducidos por el usuario.
		System.out.println("La cantidad de números introducidos son " + cant);
		// Cerramos el escaner.
		sc.close();
	}

}
