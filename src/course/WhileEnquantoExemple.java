// author hiagoforte.
// objetivo: ler números digitados pelo usuário e testar consição usando a repetição "while".

package course;

import java.util.Locale;
import java.util.Scanner;

public class WhileEnquantoExemple {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// essa mensagem deve vir antes da declaração de variáveis
		System.out.println("Enter a number:");
		
		// numero a ser digitado
		double n = sc.nextDouble();
		
		// while é igual a um if, porém, ele executa o que tem dentro da condição (while) e volta ao inicio até que seja falsa
		while (n >= 0.0) {
			double sr = Math.sqrt(n);
			System.out.printf("%.3f%n", sr);
			System.out.print("Enter another number:");
			n = sc.nextDouble();
		}
		// exibir a mensagem quando sair do while (quando a condição for 'false')
		System.out.println("Out of while!"); 
		
		sc.close();
	
	}

}