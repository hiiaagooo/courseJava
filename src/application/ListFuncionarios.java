package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionarios;

public class ListFuncionarios {
//	github.com/acenelio/list1-java
//
//
//	1 - fazer um programa para ler um n�mero inteiro N e depois os dados (id, nome e salario) de N funcion�rios. N�o deve haver repeti��o de id.
//	2 - Efetuar o aumento de X por cento no salario de um determinado funcion�rio. Para isso, o programa deve ler um id e o valor X. Se o id informado n�o existir, mostrar uma mensagem e abortar a opera��o. 
//	3 - Mostrar a listagem atualizada dos funcion�rios, conforme exemplos.
//	4 - * Aplicar tecnica de encapsulamento pois o sal�rio s� dever� ser mudado por porcentagem.
//
//  na pratica: 
//	1 Quantos funcionarios v�o ser registrados?
//	 
//	Funcionario1: ___
//	id: __
//	Nome:___
//	Salario: ____
//	 
//
//	2 - Entre com o id do funcionario que vai ganhar o aumento
//	3 - Entre com a porcentagem que aumentar� o sal�rio 
//	*caso o funcion�rio n�o exista, informar erro.
//
//	4 - Mostrar Lista atualizada.


	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Funcionarios> list = new ArrayList<>(); 
		
		// Parte 1 - Lendo os Dados
		System.out.println("Quantos funcion�rios ser�o registrados? ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Funcionario #" + i + ": ");
			
			// id
			System.out.print("Id: ");
			int id = sc.nextInt();

			//name
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			// salario
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			
			// adicionando na lista (enquanto i < n)
			list.add(new Funcionarios(id, name, salary));
		}
		
		// Parte 2 - alterando o salario de acordo com o ID selecionado.
		System.out.println();
		System.out.print("Entre com o ID referente ao funcion�rio que receber� o aumento: ");
		int id = sc.nextInt();
		
		// procurar funcionario pelo ID
		Funcionarios emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		//
		// Caso n�o encontre o ID
		if (emp == null) {
			System.out.println("ID n�o encontrado!");
		} else {
			System.out.print("Entre com a porcentagem de aumento desejada: ");
			double porcentagem = sc.nextDouble();
			emp.increaseSalary(porcentagem);
		}
		
		// Parte 3 - Incrementando o aumento 
		System.out.println();
		System.out.println("Lista de Funcionarios: ");
		
		for (Funcionarios obj: list) {
			System.out.println(obj);
		}
		
		sc.close();
	}

}
