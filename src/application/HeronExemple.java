package application;

import java.util.Scanner;

public class HeronExemple {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double xA, xB, xC, yA, yB, yC;
		
		System.out.println("Digite as áreas referentes ao triângulo X:");
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();
		
		System.out.println("Digite as áreas referentes ao triângulo Y:");
		yA = sc.nextDouble();
		yB = sc.nextDouble();
		yC = sc.nextDouble();
		
		// fórmula de Heron > calcular o tamanho de cada àrea do triangulo
		// triangulo x
		double p = (xA + xB + xC) / 2;
		double areaX = Math.sqrt(p*(p-xA) * (p-xB) * (p-xC));
		
		// triangulo y
		p = (yA + yB + yC) / 2;
		double areaY = Math.sqrt(p*(p-yA) * (p-yB) * (p-yC));
		sc.close();
		
		System.out.printf("Triangulo x Área: %.4f%n", areaX);
		
		// verificar qual àrea é maior
		if (areaX > areaY) {
			System.out.printf("A maior àrea é a do triangulo X: %.4f%n", areaX);
			} else {
				System.out.printf("A maior àrea é a do triangulo Y: %.4f%n", areaY);
		}
	}

}
