package application;

import java.util.Scanner;

import entities.Triangle;

public class HeronExemple {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// importando a entidade "Triangle"
		// dentro dessa classe, constam a, b, e c.
		// para funcionar, deve-se instanciar o objeto (new)
		Triangle x, y; 
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Digite as áreas referentes ao triângulo X:");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();

		System.out.println("Digite as áreas referentes ao triângulo Y:");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

		// fórmula de Heron > calcular o tamanho de cada àrea do triangulo
		
		
		// triangulo X	
		// x = objeto
		// area = método utilizado (dentro de Triangle) para calcular a area do triangulo.
		// x.area() = chamando o método area usando como parâmetro o triangulo x
		double areaX = x.area();

		// triangulo Y 
		// Math.sqrt() = raiz quadrada()
		// y.area() = chamando o método area usando como parâmetro o triangulo y
		double areaY = y.area();
		
		//encerra o Scanner.
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
