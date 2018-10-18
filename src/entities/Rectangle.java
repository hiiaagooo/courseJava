package entities;

public class Rectangle {
	public double a;
	public double h;
	
	// calcular o perímetro de um retângulo
	public double perimetroRet() {
		return 2*(h + a);
	}
	
	// calcular a diagonal de um retângulo
	public double diagonalRet() {
		return Math.sqrt((h*h)+(a*a));
	}
	
	// calcular a area total de um retângulo
	public double totalRet() {
		return h * a;
	}
	
	// toString para imprimir o resultado completo na tela.
	public String toString() {
		return "Perímetro: "
			+  String.format("%.2f", perimetroRet()) // para definir a quantidade de casas decimais [2].
			+  " Diagonal: "
			+  String.format("%.2f", diagonalRet())
			+  " Area Total: "
			+  String.format("%.2f", totalRet());
	}
}
