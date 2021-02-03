package partTwo;

public class UnboxingExample {

	public static void main(String[] args) {

		// variavel tipo valor (tipo primitivo int)
		int x = 20;
		
		// variavel tipo object
		Object obj = x;
		
		// int y = obj; <- para que isso funcione, é necessário um cast que converte a variável valor em referência.
		int y = (int) obj; // solução: utilizar um cast
		
	}

}
