package application;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConverter;

// ler a cotação do dólar, a quantidade de dólares necessários e imprimir o número em reais
public class StaticExemple {

	// Membro Estático (public static double VARIAVEL);
	// representam funções com valores que não mudam, por exemplo o valor de PI.
	// não é necessário instanciar o objeto para utilizar a classe.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("Digite a cotação do Dólar atual:");
		double valorCotacao = sc.nextDouble();
		System.out.print("Digite valor necessário em dólar:");
		double valorDolar = sc.nextDouble();
		
		// "result" é um nome qualquer 
		// não foi necessário instanciar o objeto, apenas chamei a função que é ESTÁTICA.
		double result = CurrencyConverter.calcularReal(valorCotacao, valorDolar);
		
		//System.out.printf("Cotação Dólar: %.2f%n,", valorCotacao);
		//System.out.printf("Quantidade em Dólar: %.2f%n,", valorDolar);
		System.out.printf("Quantidade em Reais: %.2f%n", result);
		System.out.printf("Imprimir (teste) membro estático", CurrencyConverter.REAL); // static variável
		sc.close();
		
		
	}

}
