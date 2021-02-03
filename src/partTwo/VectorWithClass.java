package partTwo;

import java.util.Locale;
import java.util.Scanner;

public class VectorWithClass {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		int n = sc.nextInt();
		ProductVector[] vect = new ProductVector[n]; // vetor tipo diferença
		
		for (int i = 0; i < n; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new ProductVector(name, price);
		}
		
		double sum = 0.0;
		for (int i = 0; i < n; i++) {
			sum += vect[i].getPrice();
		}
		
		System.out.println("Average price = " + sum/n);
		System.out.println();
		
		sc.close();
	}

}
