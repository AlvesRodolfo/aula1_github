package entities;

public class product {

	private String name;  //não acessíveis -- proteção dos atributos -- encapsulamento
	private double price;
	private int quantity;
	
	
	public product(String name, double price, int quantity) { //CONSTRUTOR - obriga dev a informar valor na instanciação
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public product(String name, double price) {   //SOBRECARGA --> DOIS CONSTRUTORES
		this.name = name;
		this.price = price;
		}
	
	public String getName() {  //metodo de acesso
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
	
		
	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
		
	}
	
	public String toString() {
		return name
			+ ", $"
			+ String.format("%.2f", price)
			+ ", "
			+ quantity
			+ " units, Total: $ "
			+ String.format("%.2f", totalValueInStock());
	}

}
