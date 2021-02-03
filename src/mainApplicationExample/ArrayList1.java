package mainApplicationExample;

import java.util.ArrayList;
import java.util.List;

public class ArrayList1 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("Fulano");
		list.add("Ciclano");
		list.add("Terclano");
		list.add(2, "newFulano"); // 2: index/posição 2

		// using for each
		for (String x : list) {
			System.out.println("nome: " + x);
		}
		// removendo itens
		// list.remove("Fulano");

		// removendo com uma condição
		// "x tal que x.primeiraPosição seja igual a 'F'"
		list.removeIf(x -> x.charAt(0) == 'F');
		System.out.println("-----------");
		for (String x : list) {
			System.out.println("nome: " + x);
		}

		System.out.println("-----------");
		// procurar um item por uma especifidade
		String name = list.stream().filter(x -> x.charAt(0) == 'C').findFirst().orElse(null);
		System.out.println("Nome:" + name);
	}

}
