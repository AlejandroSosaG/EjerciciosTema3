package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0; // Esta es la variable del número que pediremos al usuario.
		int suma=0; // Esta es la suma de números introducidos por el usuario.
		int cant=0; // Esta es la cantidad de números introducidos por el usuario.
		double media; // Esta es la media de todos los números introducidos por el usuario.
		// Generación de escaner.
		Scanner sc = new Scanner(System.in);
		// Pedimos al usuario que escriba el primer número entero.
		System.out.println("Escriba un número, si no quiere hacerlo introduzca un número negativo");
		// Asignamos el valor escrito a la variable num.
		num = sc.nextInt();
		// Mientras que el número sea mayor o igual a 0.
		while (num>=0) {
			// Asignamos a la variable suma el valor que tenía más el de la variable num.
			suma+=num;
			// Aumentamos la cantidad de números introducidos por el usuario.
			cant++;
			// Pedimos al usuario que escriba el siguiente número entero.
			System.out.println("Escriba un número, si no quiere hacerlo introduzca un número negativo");
			// Asignamos a num el nuevo valor introducido.
			num = sc.nextInt();
		}
		// Cuando el número introducido sea negativo calculamos la media de los números introducidos.
		media= suma/cant;
		// Mostramos un mensaje con la media de todos los números.
		System.out.println("La media de todos los números introducidos son " + media);
		// Cerramos el escaner.
		sc.close();
	}
}
