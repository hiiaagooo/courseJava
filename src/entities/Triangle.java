package entities;

// Não é necessário utilizar 'void static main'
// as variaveis devem conter "public"
public class Triangle {
	public double a;
	public double b;
	public double c;

	// public = metodo/funcao público
	// double = tipo de RETORNO
	// area = retorno
	// () = campos que será necessários para calcular a area (no caso, já estão
	// dentro dessa mesma classe).
	public double area() {
		double p = (a + b + c) / 2;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}
}
