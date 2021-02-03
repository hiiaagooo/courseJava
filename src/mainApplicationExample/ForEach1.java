package mainApplicationExample;

public class ForEach1 {

	public static void main(String[] args) {

		String[] vect = new String[] { "Maria", "Bob", "Alex" };

		for (int i = 0; i < vect.length; i++) {
			System.out.println(vect[i]);
		}
		System.out.println("----------");

		// using for each
		// vect representa quantidade ou dados envolvidos, nesse caos, os nomes
		// digitados
		// nomeQualquer representa um nome qualquer que pode ser usado
		// * vect representa a 'coleção'
		for (String nomeQualquer : vect) {
			System.out.println("foreach: " + nomeQualquer);
		}
	}

}
