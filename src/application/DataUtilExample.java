package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataUtilExample {

	public static void main(String[] args) throws ParseException {
		// Parte 1 - Definir formato desejado atraves do SimpleDateFormat
		SimpleDateFormat test1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat test2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat test3 = new SimpleDateFormat("dd/MM/yyyy");
		
		// Exemplo de como pegar a data atual.
		Date dtAtu = new Date();
		
		// Outras datas de exemplo.
		Date y1 = test1.parse("25/10/2018");
		Date y2 = test1.parse("25/10/2018 22:33:01");
		
		// Exibir data atual usando o formato test1.
		System.out.println(test1.format(dtAtu));
		
		// Exibir a data y2 utilizando o formato test2.
		System.out.print(test2.format(y2));
		
		
	}

}
 