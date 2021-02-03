package mainApplicationExample;

import java.util.Locale;
import java.util.Scanner;

import entities.PrivateExemple;

public class Encapsulamento {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		System.out.printf("Digite um produto: ");
		String name = sc.nextLine();
		System.out.printf("Digite o preço: ");
		Double price = sc.nextDouble();
		System.out.printf("Digite a quantidade: ");
		int quantity = sc.nextInt();

		// para que isso funcione, é necessário declarar o construtor dentro da classe
		// instanciada.
		PrivateExemple privateExemple = new PrivateExemple(name, price, quantity);

		// chama o metodo enviando os valores digitados em tela
		// privateExemple.calcularPreco(price, quantity);
		System.out.println("Preço total: " + privateExemple.calcularPreco(price, quantity));

		sc.close();
	}

}
