package course;

import java.util.Scanner;

public class SintaseExemple {

	
	// o "main" � o entry point do Java.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		// Exemplo de como criar uma fun��o para verificar qual � o maior n�mero. 
		// Utilizaremos o "max" e o "showResult"
		// Max = procura o maior n�mero entre todos.
		// showResult = apresenta o resultado.
		int higher = max(a, b, c);

		showResult(higher);
		sc.close();
	}
	
	// public = para que a fun��o possa ser utilizada em outros lugares.
	// static = para que essa fun��o possa ser chamada independente de um objeto ter/n�o ter sido criado.
	
	// n�o � necess�rio usar os mesmos nomes de vari�veis no m�todo max.
	public static int max(int x, int y, int z) {
		int aux; // essa vari�vel s� pertence a esse escopo (fun��o)
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
	
	// void = apenas traz o resultado quando n�o h� necessidade de reaproveita-lo.
	// value = para onde o showResult envia o resultado, o nome do campo � indiferente.
	public static void showResult(int value) {
		System.out.println("Higher: " + value );
	}
	
	
}
