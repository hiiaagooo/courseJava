package mainApplicationExample;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class LerArquivos {

	public static void main(String[] args) {

		// o "\\" é o prefixo de caracteres especiais,
		// então o "\\" representa uma barra ('/')invertida.
		File file = new File("C:\\Users\\cognizant\\Documents\\in.txt");

		Scanner sc = null;

		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) { // imprimir enquanto houverem caracteres
				System.out.println(sc.nextLine());
			}

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			if (sc != null) {
				sc.close();
			}

		}

	}

}
