package ejerciciosdowhile;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sol; // Esta es la variable del número que pediremos al usuario.
		int num;
		int max=100;
		int min=1;
		// Generación de escaner.
		Scanner sc = new Scanner(System.in);
		num=(int) (Math.random()*100+1);
		// Mientras que el número sea mayor o igual a 0.
		do {
			System.out.println("¿El número es " + num + "?");
			sol=sc.nextLine();
			if(sol.toLowerCase().equals("mayor")) max = num;
			else if(sol.toLowerCase().equals("menor")) min=num;
			num=(int) (Math.random()*(max-min+1)+min);
		}while(!sol.toLowerCase().equals("igual"));
		System.out.println("Enhorabuena");
		// Cerramos el escaner.
		sc.close();
	}

}
