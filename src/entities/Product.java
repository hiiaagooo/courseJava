package entities;

public class Product {
	public String name;
	public double price;
	public int quantity;
	
	// metodo para calcular pre�o x quantidade, retorna um double
	public double totalValueInStock() {
		 return price * quantity;
	}
	// m�todo para adicionar quantidades ao estoque
	// void = n�o tem retorno
	// int quantity = par�metro utilizado (n�o se trata do objeto -que tem o mesmo nome)
	// this.quantity = signica estar se referindo ao objeto
	// += :significa estar somando o valor do objeto + o valor do par�metro quantity.
	public void addProducts(int quantity) {
		this.quantity += quantity; 
	}
	
	// metodo que remove a quantidade
	public void removeProducts(int quantity) {
		this.quantity -= quantity; 
	}
	
	// m�todo para retornar a string completa
	// toString = imprime no formato String
	public String toString() {
		return name
			+ ", $ "
			+ String.format("%.2f", price) // para definir a quantidade de casas decimais [2].
			+ ", "
			+ quantity
			+ " units, Total: $ "
			+ totalValueInStock();
	}
}
 	