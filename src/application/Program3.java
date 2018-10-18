package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		// instanciar o objeto
		Rectangle rectangle = new Rectangle();
		
		// leitura
		System.out.print("Digite a altura do retângulo (A): ");
		rectangle.a = sc.nextDouble();
		System.out.print("Digite a largura do retângulo (H): ");
		rectangle.a = sc.nextDouble();
		//
		// resultado total
		System.out.println(rectangle);
		
		sc.close();
	}

}
