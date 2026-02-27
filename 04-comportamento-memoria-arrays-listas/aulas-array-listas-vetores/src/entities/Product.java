package entities;

public class Product {
	
	//ATRIBUTOS
	private String name;
	private double price;
	
	
	//CONSTRUTORES
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
		
	}
	//GET & SET
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
	
	
	
	//METODOS

}
