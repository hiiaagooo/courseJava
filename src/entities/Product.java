package entities;

public class Product {
	public String name;
	public double price;
	public int quantity;

	// criando um construtor
	// é executado no momento da instanciação "Product product = new Product();"
	// as variaveis criadas(String name, double price, int quantity) para serem
	// referenciadas aos objetos da classe (this.),
	// não precisariam ter o mesmo nome que as váriaveis da classe.
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	// metodo para calcular preço x quantidade, retorna um double
	public double totalValueInStock() {
		return price * quantity;
	}

	// método para adicionar quantidades ao estoque
	// void = não tem retorno
	// int quantity = parâmetro utilizado (não se trata do objeto -que tem o mesmo
	// nome)
	// this.quantity = signica estar se referindo ao objeto
	// += :significa estar somando o valor do objeto + o valor do parâmetro
	// quantity.
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	// metodo que remove a quantidade
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	// método para retornar a string completa
	// toString = imprime no formato String
	public String toString() {
		return name + ", $ " + String.format("%.2f", price) // para definir a quantidade de casas decimais [2].
				+ ", " + quantity + " units, Total: $ " + totalValueInStock();
	}
}
