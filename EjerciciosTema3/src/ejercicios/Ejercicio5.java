package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0; // Esta es la variable que pediremos al usuario.
		int cant=1; // Esta variable es la cantidad de números que se han introducido.
		int sumaPos = 0; // Esta es la suma de números positivos introducidos por el usuario.
		int sumaNeg = 0; // Esta es la suma de números negativos introducidos por el usuario.
		int cantNeg = 0; // Esta es la cantidad de números negativos introducidos por el usuario.
		int ceros = 0; // Esta es la cantidad de ceros introducidos por el usuario.
		double media; // Esta es la media de números negativos introducidos por el usuario.
		// Generación de escaner.
		Scanner sc = new Scanner(System.in);
		// Pedimos al usuario que escriba diez números enteros.
		System.out.println("Escriba diez números");
		// Mientras la cantidad de números introducidos sea menor a 11.
		while (cant<11) {
			// Asignamos a la variable num el valor escrito por el usuario.
			num = sc.nextInt();
			// Si el número es positivo sumamos a la varible sumaPos el valor de num.
			if(num>0) {
				sumaPos+=num;
			// Si el número es negativo sumamos a la variable sumaNeg el valor de num y aumentamos la cantidad de negativos introducidos.
			}else if(num<0) {
				sumaNeg+=num;
				cantNeg++;
			// Si el número es cero  aumentamos la cantidad de ceros introducidos.
			}else ceros++;
			// Aumentamos la cantidad de números introducidos.
			cant++;
		}
		// Asignamos a la variable media el valor de la media de números negativos introducidos mediante un cálculo.
		media=(double)sumaNeg/cantNeg;
		// Mostramos un mensaje por pantalla con la suma de números positivos, la media de números negativos y la cantidad de ceros introducidos.
		System.out.println("La suma de positivos es " + sumaPos + " , la media de negativos es " + media + " y la cantidad de ceros es " + ceros);
		// Cerramos el escaner.
		sc.close();
	}

}
