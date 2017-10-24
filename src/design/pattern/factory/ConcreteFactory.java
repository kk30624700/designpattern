package design.pattern.factory;

public final class ConcreteFactory implements Factory {

	@Override
	public Product getProduct(ProductType product) throws Exception {
		switch (product) {
		case PA:
			return new ConcreteProductA("ConcreteProductA");
		case PB:
			return new ConcreteProductB("ConcreteProductB");
		case PC:
			return new ConcreteProductC("ConcreteProductC");
		default:
			throw new Exception();
		}
	}

}
