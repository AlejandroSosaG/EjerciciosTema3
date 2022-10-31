package ejerciciosdowhile;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1; // Esta es la variable del número que pediremos al usuario.
		// Generación de escaner.
		Scanner sc = new Scanner(System.in);
		// Mientras que el número sea mayor o igual a 0.
		do {
			if(num%2==0) System.out.println(num);
			num++;
		}while(num<201);
		// Cerramos el escaner.
		sc.close();
	}

}
