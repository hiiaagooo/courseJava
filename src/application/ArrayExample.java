package application;

import java.util.Locale;
import java.util.Scanner;


// ob: ler um inteiro (n), e digitar três alturas ('1.72', '1.56', '1.80')
 // Criar um vetor (array) do 'n'.
public class ArrayExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		// ler n
		int n = sc.nextInt();
		
		// declarar vetor usando 'n'
		double[] vect = new double[n];
		
		// usar um 'for' até que as alturas recebidas sejam iguais a 'n'
		// for (i = 0; enquanto i for menor que 'n'; incrementar +1)
		for (int i=0; i<n; i++) {
			vect[i] = sc.nextDouble();
		}
		sc.close();
	}
}
