package mainApplicationExample;

import java.util.Locale;
import java.util.Scanner;

public class ArrayVector1 {
	// ler um array e ocupar cada posição com uma altura.
	// no final, calcular a media dessas alturas
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// n = quantidade
		int n = sc.nextInt();
		double[] vect = new double[n];

		// loop para ler todas as alturas
		for (int i = 0; i < n; i++) {
			vect[i] = sc.nextDouble();
		}

		double sum = 0.00;

		for (int i = 0; i < n; i++) {
			sum += vect[1];
		}

		double average = sum / n;

		System.out.println("Average Height: " + average);

		sc.close();
	}

}
