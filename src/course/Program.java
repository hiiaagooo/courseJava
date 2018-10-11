package course;

public class Program {

	public static void main(String[] args) {

		//*
		// string = %s
		// double = %.2f (".2" � a quantidade de casas decimais)
		// int = %d
		// imprimindo vari�veis de respectivos tipos
		int age = 32;
		double balance = 10.35784;
		String name = "Maria";
		System.out.printf("%s is %d years old. Balance is = %.2f", name, age, balance);

		// *
		// Opera��es aritm�ticas.
		// F�rmula de Bhaskara
		// Math.sqrt retorna a raiz quadrada do n�mero.
		double a = 1.0, b = -3.0, c = -4.0;
		double x1 = (-b + Math.sqrt(b * b - 4.0 * a * c)) / (2.0 * a);
		System.out.printf("A f�rmula de Bh�skara � %.1f", x1);
		
		// *
		// Operadores aritm�ticos.
		
		double d = 10;
		a++;
		a--;
		// d++ = d + 1
		//d--  = d - 1
		System.out.printf("s", x1);
	}
}
