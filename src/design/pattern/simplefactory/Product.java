package design.pattern.simplefactory;

public abstract class Product {
	private String type;
	public Product(String type) {
		this.type = type;
	}
	public String getType() {
		return type;
	}
	public abstract void function();
}
