package design.pattern.builder;

public class Client {
	public static void main(String[] args) {
		System.out.println(new Builder(new ConcreteDesign(), new ConcreteProcess()).getProduct());
	}
}
