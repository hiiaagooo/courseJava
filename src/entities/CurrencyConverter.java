package entities;

// Membro Est�tico (public static double VARIAVEL);
// representam fun��es com valores que n�o mudam, por exemplo o valor de PI.
// n�o � necess�rio instanciar o objeto para utilizar a classe.

public class CurrencyConverter {

	// sempre em mai�sculo & fora do void:
	// colocando "static", voc� afirma que essa fun��o INDEPENDE do objeto "CurrencyConverter"
	// ou seja, � possivel utiliza-la sem instanciar o objeto.
	// � por qu�? Pra n�o precisar instanciar em casos de vari�veis est�ticas (exemplo 'REAL')
	public static double REAL = 1.00;
	
	// tranformar o dolar em real.	
	public static double calcularReal(double valorDolar, double valorCotacao) {
		return (valorDolar / valorCotacao);
	}
}
