package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num=0; // esta es la variable que pediremos al usuario.
		// Generación de escaner.
		Scanner sc = new Scanner(System.in);
		// Pedimos al usuario que escriba un número entero, y si desea finalizar que escriba 0.
		System.out.println("Escriba un número, si no quiere hacerlo introduzca 0");
		// Asignamos a la variable num el valor escrito por el usuario.
		num = sc.nextDouble();
		// Mientras el número sea distinto a 0.
		while (num!=0) {
			// Si el número es par lo decimos por mensaje.
			if(num%2==0) System.out.println("El número es par");
			// Si el número no es par lo decimos por mensaje.
			else System.out.println("El número es impar");
			// Pedimos al usuario el valor del siguiente número.
			System.out.println("Escriba un número, si no quiere hacerlo introduzca 0");
			// Asignamos a la variable num el nuevo valor introducido.
			num = sc.nextDouble();
		}
		// Cerramos el escaner.
		sc.close();
	}

}
