package design.pattern.factory;

public class Client {
	public static void main(String[] args) {
		Factory factory = new ConcreteFactory();
		try {
			System.out.println(factory.getProduct(ProductType.PA));
			System.out.println(factory.getProduct(ProductType.PB));
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("NO SUCH PRODUCT");
		}
	}
}
