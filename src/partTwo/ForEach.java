package partTwo;

import java.util.Locale;
import java.util.Scanner;

public class ForEach {
	
public static void main(String[] args) {
	
	String[] vect = new String[] {"teste", "teste2", "teste3"};
		
	
	// for tradicioal
	for (int i = 0; i < vect.length; i++) {
		System.out.println(vect[i]);
	}
	
	// forEach 
	for (String obj : vect) { // <- Para cada objeto 'obj' contido no vetor 'vect', fa�a imprima o 'obj'
		System.out.println(obj); // exibe cada elemento do vetor por�m, utilizando o apelido 'obj' 
	}
	
	
	
	
	
	}

}
