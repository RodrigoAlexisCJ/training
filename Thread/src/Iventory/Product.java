package Iventory;

public class Product {
	private int id;
	private String name;
	
	public Product() {
		
	}
	public Product(int id, String name) {
		this.id=id;
		this.name=name;
	}
	
	@Override
	public String toString() {
		return "id: "+id+" name: "+name;
	}
}
