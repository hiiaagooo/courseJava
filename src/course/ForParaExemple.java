// author hiagoforte.
// objetivo: ler tr�s n�meros digitados pelo usu�rio e soma-los usando a repeti��o "for".

package course;

import java.util.Scanner;

public class ForParaExemple {
	
	// UTILIZAR 'FOR' apenas quando se souber a quantidade de repeti��es a serem feitas.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos n�meros voc� vai somar?");
		
		int n = sc.nextInt(); //vari�vel que vai guardar os n�meros digitados.
		int sum = 0; // sum = variavel que vai guardar a soma total.
		
		// for
		for (int i = 1; i <= n; i++) { // i++: i = 1 + 1  (*confirmar*)
			System.out.println("Value #" + i + ":");
			int x = sc.nextInt();
			sum += x;
		}
		
		System.out.println("Soma total: " + sum);
		
		sc.close();
	}

}
