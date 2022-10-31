package ejercicios;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int alturaMayor=0; // Esta es la altura del árbol más alto.
		int altura=0; // Esta es la altura del árbol que pediremos al usuario.
		// Generación de escaner.
		Scanner sc = new Scanner(System.in);
		// Pedimos al usuario que introduzca la altura de una árbol en centímetros, y si quere terminar que escriba -1.
		System.out.println("Escriba una altura de arbol en centímetros, si desea finalizar introduzca -1");
		// Asignamos a altura el valor introducido por el usuario.
		altura = sc.nextInt();
		// Mientras la altura introducida sea distinta a -1.
		while (altura!=-1) {
			// Si la altura introducida es mayor a la altura del árbol más alto, le asignamos su valor a alturaMayor.
			if(altura>alturaMayor) {
				alturaMayor=altura;
			}
			// Pedimos al usuario que introduzca una nueva altura en centímetros, y si no quiere seguir que escriba -1.
			System.out.println("Escriba una altura de arbol en centímetros, si desea finalizar introduzca -1");
			// Asignamos a altura el nuevo valor introducido por el usuario.
			altura = sc.nextInt();
		}
		// Mostramos por pantalla un mensaje con la altura del árbol más alto.
		System.out.println("La altura del arbol más alto es " + alturaMayor + " cm");
		// Cerramos el escaner.
		sc.close();
	}

}
