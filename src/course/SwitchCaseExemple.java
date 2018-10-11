// author hiagoforte
// Exemplificação de switchCase e if ternário (condições ternárias).

package course;

import java.util.Scanner;

public class SwitchCaseExemple {

	public static void main(String[] args) {
		int num1 = 500;
		
		switch (num1) {
			case 230:
				System.out.println("Test");
				break;
			case 500:
				System.out.println("Test2");
				break;
		}
		
		// if ternário / condição ternária
		// (condicao) ? valor_se_verdadeiro : valor_se_falso
		// (2 < 4) 50 : 80 resultado: 80 (por que o 80 representa "falso" e o 50, "verdadeiro".variável precisa ser inicializada)

	// exemplo de escopo de variável (toda
	   double price = 400;
	   double discount;

	   if (price < 200) {
	       discount = price * 0.1;
	   } else {
		   discount = 0;
	   }
	  
	   System.out.println(discount);
	   
	}
}
