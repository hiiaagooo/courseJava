package partTwo;

import java.util.Locale;
import java.util.Scanner;

public class MainQuotation {

	public static void main(String[] args) {
		

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual é o preço do euro?");
		double q = sc.nextDouble();
		System.out.println("Qual é quantidade de euros?");
		double d = sc.nextDouble();
	
		
		System.out.println("Preço em Reais: " + DolarQuotation.getValueInReal(q, d));
		System.out.println("Euro no valor de: " + q);
	}

}
