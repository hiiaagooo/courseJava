package partTwo;

import java.util.ArrayList;
import java.util.List;
// importar do java.util
import java.util.stream.Collectors;

public class ListExample {
	
	public static void main(String[] args) {
		
		// deve ser utilizado tipo Object ('Integer', que aceita null), pois o tipo primitivo (int) n�o � aceito
		
		// Interfaces n�o podem ser instanciadas diretamente, ent�o deve-se utilizar uma classe que implementa interfaces..
		// .. nesse caso, 'List' � uma interface, ent�o utilizamos o ArrayList para implementar a Interface 'List'..
		// ex: List<Integer> list = new ArrayList<>();
		
		
		List<String> list = new ArrayList<>();
		
		list.add("Nome"); 
		list.add("nome2");
		list.add("nome3");
		
		// inserir elemento na posi��o 2: .add(int index, String)
		list.add(2, "Teste1");
		
		System.out.println("*-----------------------------------*");
		
		// remover um item pela compara��o de String
		list.remove("Nome");
		// ou remover pelo index
		list.remove(2);
		
		// remover todos que come�am com a letra "N" (remover por predicado, que nesse caso � o 'x')
		// fun��o lambda: (x -> x.charAt(0) == 'N') - remover toda String ('x') tal que (->) s� se o primeiro caracter seja == 'N'
		list.removeIf(x -> x.charAt(0) == 'N'); // removeIf vai resultar em V ou F
		
		// para cada String que contenha na lista, imprima
		for (String nomeQualquer : list) {
			System.out.println(nomeQualquer);
		}
		
		
		// encontrar a posi��o de um elemento
		// quando o indexOf n�o encontra o elemento, ele retorna -1
		System.out.println("Index do Teste1: " + list.indexOf("Teste1")); 
		
		 
		// manter na lista apenas os nomes que come�am com 'N'
		// criar uma nova lista 'result', pegar a lista original e filtrar os que come�am com 'N' e depois colocar na lista nova.
		
		// list.stream().filter: filtro
		// .collect(Collectors.toList(): atualiza a list de acordo com o filtro selecionado
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'T').collect(Collectors.toList());
		
		// para cada String (representada por x) que conter na lista result, fa�a:
		for (String x : result) {
			System.out.println(x);
		}
		
		
		// encontrar um elemento da lista que atenda um predicado especifico.
		// findFirst: exibe o primeiro elemento que foi encontrado de acordo com o filter selecionado, ou exibe nulo (orElse(null).
		String name = list.stream().filter(x -> x.charAt(0) == 'n').findFirst().orElse(null);
		System.out.println("orElse: " + name);
		
	}

}
