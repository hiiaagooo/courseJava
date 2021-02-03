package partTwo;

import java.util.Locale;
import java.util.Scanner;

public class ProductsMain {

	public static void main(String[] args) {
		Product p = new Product();
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o nome do produto:");
		p.name = sc.next();
		
		System.out.println("Digite o preço do produto:");
		p.price = sc.nextDouble();
		
		System.out.println("Digite a quantidade do produto:");
		p.quantity = sc.nextInt();
		
		p.addProducts(p.quantity);
		System.out.println("Produto: " + p.getName());
		System.out.println("Preço: "+ p.getPrice());
		System.out.println("Quantidade: " + p.getQuantity());
		System.out.println("Total de Produtos no Stock: " + p.totalValueinStock());
	}

}
