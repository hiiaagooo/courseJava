package course;

import java.util.Scanner;

public class ExempleScanner {
	
	// sempre utilizar sc.netxLine antes de usar qualquer variável com sc.nextLine()
	// sc.nextLine();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		System.out.println("What's time is it?");
		int time = sc.nextInt();
		if (time < 12) {
			System.out.println("Good Morning!" );
		} else if (time < 18) {
			System.out.println("Good Night!" );
			} else {
			System.out.println("No make sense!" );
		}
		
		sc.close();
		
		// exemplo utilizando operações condicionais.
		
	}
	
	
	

}
