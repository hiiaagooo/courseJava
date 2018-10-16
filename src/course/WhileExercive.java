package course;

import java.util.Locale;
import java.util.Scanner;

import javax.tools.DocumentationTool.Location;

// digitar n�meros (positivos) e ao final, mostrar qual � o maior (higher).

public class WhileExercive {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter N: ");
		int n = sc.nextInt(); // variavel que vai guardar o numero digitado
		while (n <= 0) { // enquanto 'n' nao for positivo, faca
			System.out.print("N must be positive! Try again: ");
			n = sc.nextInt();
		}
		int higher = Integer.MIN_VALUE; // variavel que vai guardar o valor m�nimo
		
		// utilizar o 'for' para verificar qual � o maior n�mero, pois j� sabemos a quantidade
		// de vezes a serem executadas.
		// i = 1, enquanto i for menor ou igual a 'n' (n�mero digitado), ir acrescentando mais 1 (++i).
		for (int i = 1; i <= n; i++) { 
			System.out.print("Value #" + i + ": ");
			int x = sc.nextInt();
			if (x > higher) {
				higher = x;
			}
		}
		System.out.println("Higher = " + higher);
		sc.close();
	}

}
