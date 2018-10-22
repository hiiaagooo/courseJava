package entities;

public class PrivateExemple {

	// exemplo de encapsulamento utilizando get and set
	private String name;
	private double price;
	private int quantity;
	
	// construtor
	public PrivateExemple(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	// gerando get and set
	// serve para tratar variaveis encapsuladas (private)
	// botao dir > sources > generate get....
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	// calcular o preço
	public double calcularPreco(double price, int quantity ) {
		return this.quantity * this.price;
	}
	
	
	
	
}
