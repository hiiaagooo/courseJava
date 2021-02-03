package partTwo;

import java.util.Locale;
import java.util.Scanner;

public class Matrizes {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// System.out.println("Quantidade de Funcionários que receberão aumento: ");
		int n = sc.nextInt();

		// criando a matriz ([] [])
		int[][] mat = new int[n][n]; // [n][n] = 3 linhas e 3 colunas
		
		// primeiro for que calcula as linhas
		for (int i = 0; i < n; i++) {

			// & para cada linha esse outro for percorre a coluna referente à aquela linha
			for (int j = 0; j < n; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		sc.close();

	}

}
