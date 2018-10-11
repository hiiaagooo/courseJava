package course;

import java.util.Scanner;

public class SintaseExemple {

	
	// o "main" é o entry point do Java.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		// Exemplo de como criar uma função para verificar qual é o maior número. 
		// Utilizaremos o "max" e o "showResult"
		// Max = procura o maior número entre todos.
		// showResult = apresenta o resultado.
		int higher = max(a, b, c);

		showResult(higher);
		sc.close();
	}
	
	// public = para que a função possa ser utilizada em outros lugares.
	// static = para que essa função possa ser chamada independente de um objeto ter/não ter sido criado.
	
	// não é necessário usar os mesmos nomes de variáveis no método max.
	public static int max(int x, int y, int z) {
		int aux; // essa variável só pertence a esse escopo (função)
		if (x > y && x > z) {
			aux = x;
		} 
		else if ( y > z) {
			aux = y;
		} 
		else {
			aux = z;
		}
		return aux;
	}
	
	// void = apenas traz o resultado quando não há necessidade de reaproveita-lo.
	// value = para onde o showResult envia o resultado, o nome do campo é indiferente.
	public static void showResult(int value) {
		System.out.println("Higher: " + value );
	}
	
	
}
