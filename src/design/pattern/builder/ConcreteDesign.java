package design.pattern.builder;

public class ConcreteDesign implements Design {

	@Override
	public Product go() {
		return new Product("finish design");
	}

}
