package design.pattern.factory;

public interface Factory {
	public Product getProduct(ProductType product) throws Exception;
}
