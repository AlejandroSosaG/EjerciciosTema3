package ejerciciosdowhile;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1; // Esta es la variable del número que pediremos al usuario.
		// Generación de escaner.
		Scanner sc = new Scanner(System.in);
		// Mientras que el número sea mayor o igual a 0.
		do {
			System.out.println(num);
			num++;
		}while(num<21);
		// Cerramos el escaner.
		sc.close();
	}

}
