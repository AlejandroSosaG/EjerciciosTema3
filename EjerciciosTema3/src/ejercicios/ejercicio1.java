package ejercicios;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0; // Esta es la variable que pediremos al usuario.
		int suma=0; // Esta es la suma de todos los números introducidos por el usuario.
		// Generación de escaner.
		Scanner sc = new Scanner(System.in);
		// Pedimos al usuario que escriba el primer número entero.
		System.out.println("Escriba un número, si no quiere hacerlo introduzca un número negativo");
		// Asignamos el valor escrito a la variable num.
		num = sc.nextInt();
		// Mientras que el número sea mayor o igual a 0.
		while (num>=0) {
			// Le sumamos a la variable suma el valor de num.
			suma+=num;
			// Pedimos al usuario que escriba el siguiente número entero.
			System.out.println("Escriba un número, si no quiere hacerlo introduzca un número negativo");
			// Asignamos a num el nuevo valor introducido.
			num = sc.nextInt();
		}
		// Cuando el usuario escribe un número negativo mostramos un mensaje por pantalla diciendo cúal es la suma de todos los números.
		System.out.println("La suma de todos los números introducidos son " + suma);
		// Cerramos el escaner.
		sc.close();
	}

}
