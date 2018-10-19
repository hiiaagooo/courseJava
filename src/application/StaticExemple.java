package application;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConverter;

// ler a cota��o do d�lar, a quantidade de d�lares necess�rios e imprimir o n�mero em reais
public class StaticExemple {

	// Membro Est�tico (public static double VARIAVEL);
	// representam fun��es com valores que n�o mudam, por exemplo o valor de PI.
	// n�o � necess�rio instanciar o objeto para utilizar a classe.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("Digite a cota��o do D�lar atual:");
		double valorCotacao = sc.nextDouble();
		System.out.print("Digite valor necess�rio em d�lar:");
		double valorDolar = sc.nextDouble();
		
		// "result" � um nome qualquer 
		// n�o foi necess�rio instanciar o objeto, apenas chamei a fun��o que � EST�TICA.
		double result = CurrencyConverter.calcularReal(valorCotacao, valorDolar);
		
		//System.out.printf("Cota��o D�lar: %.2f%n,", valorCotacao);
		//System.out.printf("Quantidade em D�lar: %.2f%n,", valorDolar);
		System.out.printf("Quantidade em Reais: %.2f%n", result);
		System.out.printf("Imprimir (teste) membro est�tico", CurrencyConverter.REAL); // static vari�vel
		sc.close();
		
		
	}

}
