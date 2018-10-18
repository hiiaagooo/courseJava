package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Notes;

public class Program4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		//instanciando o objeto
		Notes notes = new Notes();
		
		// nome
		System.out.println("Digite o nome do Aluno: ");
		notes.name = sc.nextLine();
		// primeiro trimestre
		System.out.println("Digite a Primeira note: ");
		notes.note1 = sc.nextDouble();
		//segundo trimestre
		System.out.println("Digite a Segunda nota: ");
		notes.note2 = sc.nextDouble();
		// terceiro trimestre
		System.out.println("Digite a Terceira nota: ");
		notes.note3 = sc.nextDouble();
		
		//verificar nota1
		if (notes.firstNote()) {
			System.out.println("it's ok!");
		} else {
			System.out.println("Its, not ok!");
		}
		//verificar nota2 e nota3
		if (notes.anotherNote()) {
			System.out.println("it's ok!");
		} else {
			System.out.println("Its, not ok!");
		}
		
		// IMPLEMENTAR MEDIA GERAL
		sc.close();
	}
}
