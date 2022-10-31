package ejerciciosdowhile;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1; // Esta es la variable del número que pediremos al usuario.
		int numMax;
		int suma=0;
		// Generación de escaner.
		Scanner sc = new Scanner(System.in);
		System.out.println("Diga el número máximo");
		numMax=sc.nextInt();
		// Mientras que el número sea mayor o igual a 0.
		do {
			suma+=num;
			num++;
		}while(num<=numMax);
		System.out.println("La suma de todos los números es " + suma);
		// Cerramos el escaner.
		sc.close();
	}

}
