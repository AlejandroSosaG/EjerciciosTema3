package ejercicios;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numSecreto; // Esta es la variable del número secrteto que deberá adivinar el usuario y se generará aleatoriamente.
		int num=0; // Este es el número que pediremos al usuario.
		// generación de escaner.
		Scanner sc = new Scanner(System.in);
		// Asignamos a numSecreto un valor aleatorio entre 1 y 100.
		numSecreto = (int)Math.random()*100+1;
		// Pedimos al usuario que escriba un número entero, y si desea rendirse que escriba -1.
		System.out.println("Escriba un número entre 1 y 100, si desea rendirse introduzca -1");
		// Asignamos a num el valor escrito por el usuario.
		num = sc.nextInt();
		// Mientras el número introducido por el usuario sea distinto al número secreto y a -1.
		while (num!=numSecreto || num!=-1) {
			// Si el número introducido es menor al secreto lo decimos en un mensaje.
			if(num<numSecreto) {
				System.out.println("El número introducido es menor al número secreto");
			// Si el número introducido es menor al secreto lo decimos en un mensaje.
			}else System.out.println("El número introducido es mayor al número secreto");
			// Pedimos al usuario que escriba un nuevo número, y si desea rendirse que escriba -1.
			System.out.println("Escriba un número, si desea rendirse introduzca -1");
			// Asignamos a num el nuevo valor introducido por el usuario.
			num = sc.nextInt();
		}
		// Si el usuario acierta el número secreto lo decimos por mensaje.
		if(num==numSecreto) System.out.println("Enhorabuena, ha acertado el número secreto");
		else System.out.println("Que tenga más suerte la próxima vez");
		// Cerramos el escaner.
		sc.close();
	}

}
