package application;

import java.util.Locale;
import java.util.Scanner;

import course.AuxArrayVector2;

public class ArrayVector2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		AuxArrayVector2[] vect = new AuxArrayVector2[10];
		
		System.out.println("Digite a quantidade de hóspedes: ");
		// n = quantidade de hospedes
		int n = sc.nextInt();

		for (int i=1; i<=n; i++) {
			System.out.println();
			System.out.println("Quantidade #" + i + ":");
			System.out.print("Nome: ");
			sc.nextLine();
			
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Quarto: ");
			int room = sc.nextInt();
			// criar novo array com nome e quarto
			vect[room] = new AuxArrayVector2(name, email);
		}
		
			System.out.println();
			System.out.println("Quartos ocupados:");
			for (int i=0; i<10; i++) {
				if (vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}
		}
		
		sc.close();
	}

}
