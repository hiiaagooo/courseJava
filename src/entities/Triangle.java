package entities;

// N�o � necess�rio utilizar 'void static main'
// as variaveis devem conter "public"
public class Triangle {
	public double a;
	public double b;
	public double c;

	// public = metodo/funcao p�blico
	// double = tipo de RETORNO
	// area = retorno
	// () = campos que ser� necess�rios para calcular a area (no caso, j� est�o
	// dentro dessa mesma classe).
	public double area() {
		double p = (a + b + c) / 2;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}
}
