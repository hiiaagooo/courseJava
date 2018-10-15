// author hiagoforte.
// objetivo: ler n�meros digitados pelo usu�rio e testar consi��o usando a repeti��o "while".

package course;

import java.util.Locale;
import java.util.Scanner;

public class WhileEnquantoExemple {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// essa mensagem deve vir antes da declara��o de vari�veis
		System.out.println("Enter a number:");
		
		// numero a ser digitado
		double n = sc.nextDouble();
		
		// while � igual a um if, por�m, ele executa o que tem dentro da condi��o (while) e volta ao inicio at� que seja falsa
		while (n >= 0.0) {
			double sr = Math.sqrt(n);
			System.out.printf("%.3f%n", sr);
			System.out.print("Enter another number:");
			n = sc.nextDouble();
		}
		// exibir a mensagem quando sair do while (quando a condi��o for 'false')
		System.out.println("Out of while!"); 
		
		sc.close();
	
	}

}