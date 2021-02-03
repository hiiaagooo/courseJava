package partTwo;

import java.util.Locale;
import java.util.Scanner;

public class Vector {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// quantidade de itens no vetor
		int n = sc.nextInt();
		
		// cria-se o vetor de acordo com a quantidade de itens solicitados
		double[] vect = new double[n];
		
		// preenchendo o vetor (cada posição dele)
		for (int i = 0; i < n; i++ ) {
			vect[i] = sc.nextDouble(); //vect é a variável que vai receber os valores que o user digitar
		}

		// calcular a media
		double soma = 0.0;
		for (int i = 0; i <n; i++) {
			soma += vect[i]; // soma (acumulando) todos os itens do vetor
		}
		
		System.out.println("average" + soma / n); // divide pela quantidade total dos itens (n)
		
		sc.close(); 
	}

}
