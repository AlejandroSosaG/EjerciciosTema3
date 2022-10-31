package ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int edad=0; // Esta es la edad de los alumnos que pediremos al usuario.
		int cant=0; // Esta es la cantidad de edades introducidas por el usuario.
		int suma = 0; // Esta es la suma de edades iintroducidas por el usuario.
		int mayorEdad = 0; // Esta variable es la cantidad de alumnos que son mayores de edad.
		double media; // Esta es la media de todas las edades introducidas por el usuario.
		// Generación de escaner.
		Scanner sc = new Scanner(System.in);
		// Pedimos al usuario que introduzca una edad, si no quiere que escriba un número negativo.
		System.out.println("Escriba una edad, si no quiere seguir introduzca un número negativo");
		// Asignamos a la veriable edad el valor introducido por el usuario.
		edad = sc.nextInt();
		// Mientras la edad sea positiva.
		while (edad>=0) {
			// Le sumamos a la variable suma el valor de edad.
			suma+=edad;
			// Aumentamos la cantidad de edades introducidas.
			cant++;
			// Si el valor de edad es mayor a 17 aumentamos la cantidad de alumnos mayor de edad.
			if(edad>17) mayorEdad++;
			// Pedimos al usuario que introduzca una nueva edad, si no quiere que escriba un número negativo.
			System.out.println("Escriba una edad, si no quiere seguir introduzca un número negativo");
			// Asignamos a edad el nuevo valor introducido por el usuario.
			edad = sc.nextInt();
		}
		// Asignamos a la variable media el valor de la media de edades introducidas por el usuario mediante un cálculo.
		media=(double)suma/cant;
		// Mostramos un mensaje por pantalla con la suma de todas las edades, la cantidad de alumnos, y la cantidad de alumnos mayores de edad.
		System.out.println("La suma de las edades es " + suma + " , la media es " + media + " , la cantidad de alumnos es " + cant + " y la cantidad de mayores de edad es " + mayorEdad);
		// Cerramos el escaner.
		sc.close();
	}

}
