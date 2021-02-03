package partTwo;

public class Product {

	String name;
	double price;
	int quantity;

	public double totalValueinStock() {

		return price * quantity;
	}

	public void addProducts(int qtd) {
		this.quantity += qtd;
			
	}

	public void removeProducs(int qtd) {
		this.quantity -= qtd;
	}
	
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

}
