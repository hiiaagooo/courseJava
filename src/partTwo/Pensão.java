package partTwo;

import java.util.Locale;
import java.util.Scanner;

public class Pensão {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantidade de quartos:");
		int n = sc.nextInt();
		Inquilinos[] inq = new Inquilinos[10];

		for (int i = 0; i <= n; i++) {
			System.out.println();
			System.out.println("Rent #" + i + ":");
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			inq[room] = new Inquilinos(name, email, room);
		}

		System.out.println("Busy rooms:");
		for (int i = 0; i < 10; i++) {
			if (inq[i] != null) {
				System.out.println(i + ": " + inq[i]);
			}
		}

		sc.close();

	}

}
