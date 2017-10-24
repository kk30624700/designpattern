package design.pattern.decorator;

public class Client {
	public static void main(String[] args) {
		new Decorator(new ConcreteComponent()).run();
	}
}
