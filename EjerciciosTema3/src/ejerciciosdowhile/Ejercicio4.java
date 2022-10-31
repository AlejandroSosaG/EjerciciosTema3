package ejerciciosdowhile;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num; // Esta es la variable del número que pediremos al usuario.
		int mult=1;
		// Generación de escaner.
		Scanner sc = new Scanner(System.in);
		System.out.println("Diga el número de la tabla de multiplicar");
		num=sc.nextInt();
		// Mientras que el número sea mayor o igual a 0.
		do {
			System.out.println(num + " x " + mult + " = " + num*mult);
			mult++;
		}while(mult<11);
		// Cerramos el escaner.
		sc.close();
	}

}
