package design.pattern.factory;

public abstract class Product {
	protected String type;
	
	protected Product(String type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		return type;
	}
}
