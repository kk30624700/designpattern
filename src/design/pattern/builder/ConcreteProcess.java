package design.pattern.builder;

public class ConcreteProcess implements Process {

	@Override
	public Product go(Product product) {
		product.setMsg(product.getMsg() + " finish process");
		return product;
	}

}
