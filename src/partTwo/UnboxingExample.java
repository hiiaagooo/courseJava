package partTwo;

public class UnboxingExample {

	public static void main(String[] args) {

		// variavel tipo valor (tipo primitivo int)
		int x = 20;
		
		// variavel tipo object
		Object obj = x;
		
		// int y = obj; <- para que isso funcione, � necess�rio um cast que converte a vari�vel valor em refer�ncia.
		int y = (int) obj; // solu��o: utilizar um cast
		
	}

}
