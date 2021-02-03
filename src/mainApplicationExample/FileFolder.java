package mainApplicationExample;

import java.io.File;
import java.util.Scanner;

public class FileFolder {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Folder path: ");
		String strPath = sc.nextLine();

		File path = new File(strPath);

		// cria um novo diretorio
		new File(strPath + "\\subdir").mkdir();

		sc.close();
	}

}
