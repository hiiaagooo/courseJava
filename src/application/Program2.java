package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// instanciar o objeto "product"
		Product product = new Product();
		
		// ******* Leitura dos dados ******
		System.out.println("Enter to new Product:");
		System.out.print("Name:");
		// utilizando os atributos (de product) no scanner. 
		product.name = sc.nextLine();
		// Price
		System.out.print("Price: ");
		product.price = sc.nextDouble();
		// Quantity in Stock
		System.out.print("Quantity in Stock:");
		product.quantity = sc.nextInt();
		
		// ******* Fim da Leitura dos dados ******
		
		// exibir utilizando toString (o java entende apenas o "product" - implicitamente ele chama o 'toString'
		System.out.println(product);
		
		sc.close();
	
	}

}
