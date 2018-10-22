package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// ******* Leitura dos dados ******
		System.out.println("Enter to new Product:");
		System.out.print("Name:");
		// utilizando os atributos (de product) no scanner. 
		String name = sc.nextLine();
		// Price
		System.out.print("Price: ");
		double price = sc.nextDouble();
		// Quantity in Stock
		System.out.print("Quantity in Stock:");
		int quantity = sc.nextInt();
		
		// instanciar o objeto "product", utilizando o construtor
		// vantagens: iniciar a instância com objetos preenchidos com os valores digitados acima.
		Product product = new Product(name, price, quantity);
		
		// ******* Fim da Leitura dos dados ******
		
		// exibir utilizando toString (o java entende apenas o "product" - implicitamente ele chama o 'toString'
		System.out.println(product);
		
		// Adicionando quantidades.
		System.out.println();
		System.out.print("Entry to products quantity to add:");
		quantity = sc.nextInt();
		product.addProducts(quantity);
		
		// valor atualizado
		System.out.println();
		System.out.println(product);
		
		// Removendo quantidades.
		System.out.println();
		System.out.print("Entry to products quantity to remove:");
		quantity = sc.nextInt(); //reaproveitando variável JÁ DECLARADA anteriormente
		product.removeProducts(quantity);
		// valor atualizado
		System.out.println();
		System.out.println(product);
		
		sc.close();
	}

}
