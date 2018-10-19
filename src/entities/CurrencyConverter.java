package entities;

// Membro Estático (public static double VARIAVEL);
// representam funções com valores que não mudam, por exemplo o valor de PI.
// não é necessário instanciar o objeto para utilizar a classe.

public class CurrencyConverter {

	// sempre em maiúsculo & fora do void:
	// colocando "static", você afirma que essa função INDEPENDE do objeto "CurrencyConverter"
	// ou seja, é possivel utiliza-la sem instanciar o objeto.
	// ô por quê? Pra não precisar instanciar em casos de variáveis estáticas (exemplo 'REAL')
	public static double REAL = 1.00;
	
	// tranformar o dolar em real.	
	public static double calcularReal(double valorDolar, double valorCotacao) {
		return (valorDolar / valorCotacao);
	}
}
