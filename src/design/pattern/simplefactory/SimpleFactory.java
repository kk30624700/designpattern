package design.pattern.simplefactory;

public class SimpleFactory {
	public Product getProduct() {
		return new ConcreteProduct("Type A");
	}
}
