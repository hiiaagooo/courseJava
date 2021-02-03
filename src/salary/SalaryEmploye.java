package salary;

import java.util.Locale;
import java.util.Scanner;

public class SalaryEmploye {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantidade de Funcion�rios que receber�o aumento: ");
		int n = sc.nextInt();

		Employ[] emp = new Employ[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Id do Funcionario: ");
			int id = sc.nextInt();

			System.out.println("Nome do Funcion�rio: ");
			sc.nextLine();
			String name = sc.next();

			System.out.println("Sal�rio: ");
			double salario = sc.nextDouble();

			emp[i] = new Employ(id, name, salario);

		}

		// System.out.println("Porcentagem de aumento de sal�rio");
		System.out.println("Funcion�rios: ");
		for (int i = 0; i < n; i++) {
			System.out.println("*-----------------------");
			System.out.println("ID: " + emp[i].getId());
			System.out.println("Nome: " + emp[i].getName());
			System.out.println("Sal�rio: " + emp[i].getSalary());
		}

		// aumento
		System.out.println("Digite o Id do funcionario que receber� o aumento: ");
		int id = sc.nextInt();

		System.out.println("Digite a porcentagem do aumento");
		int percent = sc.nextInt();

		for (int i = 0; i <= n; i++) {
			if (emp[i].getId() == id) {
				System.out.println("Atual salario: " + emp[i].getSalary());
				emp[i].setSalary(emp[i].getSalary() + ((percent / 100.0) * emp[i].getSalary()));
				System.out.println("Id: " + emp[i].getId() + " id solicitado " + id);
				System.out.println("Porcentagem: " + percent);
				System.out.println("Novo salario: " + emp[i].getSalary());

			}

		}

		sc.close();

	}

}
