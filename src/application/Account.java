package application;

import java.util.Locale;
import java.util.Scanner;

public class Account {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Tell us your Account Number: ");
		int accountNumber =  sc.nextInt();
		System.out.println("Tell us a value for your Account: ");
		String accountName =  sc.nextLine();
		System.out.println("Tell us your Account Name: ");
		double accountValor =  sc.nextDouble();
		// CONTINUAR AQUI
		
	}

}
