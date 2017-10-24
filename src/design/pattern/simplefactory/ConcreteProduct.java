package design.pattern.simplefactory;

public class ConcreteProduct extends Product {

	public ConcreteProduct(String type) {
		super(type);
	}

	@Override
	public void function() {
		System.out.println("ConcreteProduct");		
	}

}
